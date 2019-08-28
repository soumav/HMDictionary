# Getting Started

This API exposes 2 services :

	(1) File Upload (in .txt formats) - This API parse the file and stores each space-separated word in the uploaded file in memory. 
	(2) Word Search - Searches for the given word. 
	(Note: As the words are stored in memory and not a specific DB, hence this works with each file upload per session i.e. once a new file is uploaded, the old file contents gets overwritten in memory and word is searched from the latest uploaded file. Once the server is restarted, all words/data is lost.)

Base URL : http://localhost:8080/hmdictionary/

Services : 
	
	a) file upload - localhost:8080/hmdictionary/upload
		(file format for this is .txt)
	b) search - localhost:8080/hmdictionary/search/<WordToSearch>
