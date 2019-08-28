package com.hmdict.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hmdict.bean.Trie;

@Service
public class MultipartFileUtil {

	public boolean readAndStoreFile(MultipartFile file,Trie trie) {
		BufferedReader br;
		try {

			String line;
			InputStream is = file.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				String wordsInLine[]=line.split(" ");
				for(String word: wordsInLine)
					trie.insert(word);
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
			return false;
		}
		return true;
	}
}
