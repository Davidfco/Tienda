
package com.tiendaDavid.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-2bd8a.appspot.com";
    
    //Esta es la ruta basica de este proyecto techshop
    final String rutaSuperiorStorage = "techshop";
    
    //Ubicacion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //Nombre del archivo json
    final String archivoJsonFile = "techshop-2bd8a-firebase-adminsdk-xk9vy-ea1d297b72";
    
}
