# group12test

setup:
  1. gera nýtt maven project.
  2. látta groupId vera = is.ru.honn.group1 og artifactId = Project2
  3. fær svon is.ru.honn/group12 i src/main/java í projectinu
  4. replace-a pom.xml file.
  5. setja svo t-302-honn-2019_Publication-P2.json efst í folder-inu(sama stað og pom.xml file)
  6. build og run.
  7. fara í postman og í ýtta á browse takkan í hægra neðri horninu og gera eftirfarandi skipanir
      a. velja GET: http://localhost:8080/Publications
      b. velja GET: http://localhost:8080/Publications/500 (fyrir sérstakt id)
      c. velja POST: http://localhost:8080/Publications/ ýtta a body->raw dropdown JSON(stendur væntalega text í dropdown möguleika)
          copy paste json-ið hér fyrir neðan
        {
            "editor_first_name":"Viktor",
            "editor_last_name":"Ingi",
            "publication_title":"viktor livia",
            "isbn":"86257397-5",
            "journal":"MBL",
            "year":2011,
            "type":"electronic"
        }
    
      d. velja GET: http://localhost:8080/Publications/1001 (nýja Publication var add-að)
      e. DELETE: http://localhost:8080/Publications/1001 (delete-ar id = 1001)
      d. velja GET: http://localhost:8080/Publications/1001 (nýja Publication var delete-að).
