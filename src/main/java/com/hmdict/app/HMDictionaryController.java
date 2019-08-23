package com.hmdict.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hmdict.bean.Trie;
import com.hmdict.service.MultipartFileUtil;


@RestController
public class HMDictionaryController {

	@Autowired
	MultipartFileUtil fileUtil;
	
	@Autowired
	Trie trie;
	
	@PostMapping(path="/upload/{file}")
	public boolean upload(@PathVariable("file") MultipartFile file) {

		return fileUtil.readAndStoreFile(file,trie);
		
	}
	@GetMapping(path="/search/{word}")
	public boolean searchWord(@PathVariable("word") String word) {
		return trie.search(word);
	}
		
}
