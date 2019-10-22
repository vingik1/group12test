package is.ru.honn.group12.Services;

import is.ru.honn.group12.JsonHandler;
import is.ru.honn.group12.Models.Publications;

import java.util.List;

public class PublicationService {
    private List<Publications> publicationsList;
    private static PublicationService instance = null;
    public static PublicationService getInstance(){
        if(instance == null){
            instance = new PublicationService();
        }
        return instance;
    }

    public PublicationService(){
        publicationsList = JsonHandler.publicationsCreator();
    }

    public List<Publications> getAllPublications(){
        return publicationsList;
    }

    public Publications addPublication( String editor_first_name, String editor_last_name, String publication_title,
                                       String isbn, String journal, int year, String type){
        int id = publicationsList.size() + 1;
        Publications newPublication = new Publications(id, editor_first_name,editor_last_name,publication_title,
                isbn,journal,year,type);
        publicationsList.add(newPublication);
        return newPublication;
    }
    public Publications getPublicationById(int id){
        // needs to add borrowing history too
        for(Publications publication: publicationsList){
            if(publication.getId() == id){
                return publication;
            }
        }
        return null;
    }

    public boolean deletePublication(int id){
        int position = -1;
        for(Publications publication: publicationsList){
            if(publication.getId() == id){
                position = publicationsList.indexOf(publication);
                continue;
            }
        }
        if(position > -1){
            publicationsList.remove(position);
        }
        return true;
    }

}
