package is.ru.honn.group12.Controllers;

import is.ru.honn.group12.Models.Publications;
import is.ru.honn.group12.Services.PublicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PublicationController {
    PublicationService publicationData = PublicationService.getInstance();

    @GetMapping("/Publications")
    public List<Publications> index(){
        return publicationData.getAllPublications();
    }

    @PostMapping("/Publications")
    public Publications createPublication(@RequestBody Map<String, String> body){
        String editor_first_name = body.get("editor_first_name");
        String editor_last_name = body.get("editor_last_name");
        String publication_title = body.get("publication_title");
        String isbn = body.get("isbn");
        String journal = body.get("journal");
        int year = Integer.parseInt(body.get("year"));
        String type = body.get("type");

        return publicationData.addPublication(editor_first_name, editor_last_name, publication_title,
                                        isbn, journal, year, type);
    }

    @GetMapping("/Publications/{id}")
    public Publications publicationById(@PathVariable String id){
        int publicationId = Integer.parseInt(id);
        return publicationData.getPublicationById(publicationId);
    }

    @DeleteMapping("/Publications/{id}")
    public boolean deletePublication(@PathVariable String id){
        int publicationId = Integer.parseInt(id);
        return publicationData.deletePublication(publicationId);
    }
}
