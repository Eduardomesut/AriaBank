package com.ariabank.ariabankback.controllers;


import com.ariabank.ariabankback.upload.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;


@Controller
@RequiredArgsConstructor
public class FicherosController {
	
	private static final Logger logger = LoggerFactory.getLogger(FicherosController.class);

	
	private final StorageService storageService;
	
	
	@GetMapping(value="/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename, HttpServletRequest request) {
		Resource file = storageService.loadAsResource(filename);
		
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(file.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        if(contentType == null) {
            contentType = "application/octet-stream";
        }
		
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(contentType))
				.body(file);
	}

}