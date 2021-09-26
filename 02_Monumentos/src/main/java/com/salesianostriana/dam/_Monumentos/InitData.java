package com.salesianostriana.dam._Monumentos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repository;

    @PostConstruct
    public void init(){


        repository.saveAll(
                Arrays.asList(
                        new Monumento("FR", "Francia", "París", "48°52′26″N 2°17′42″E", "Arco del Triunfo", "es uno de los monumentos más famosos de la capital francesa y probablemente se trate del arco de triunfo más célebre del mundo...", "https://elhexagono.net/wp-content/uploads/2016/10/Arc-de-Triomphe-Paris-Photo-Jiuguang-Wang-e1475607945104.jpg"),
                        new Monumento("IT", "Italia", "Roma", "41°53′55″N 12°28′37″E", "Panteón de Roma", "El edificio es circular con un pórtico de grandes columnas corintias de granito...", "https://assets.buendiatours.com/s3fs-public/styles/highlight_large/public/2019-12/roma-que-ver-panteon-agripa-frente.jpg?VersionId=u7v4.9409rEphvXAAmXw.7EYmuLPex2N&itok=cWFJ0PRc"),
                        new Monumento("NA", "Estados Unidos", "Washington D. C.", "38°53′22″N 77°02′07″O", "Monumento a Washington", " normalmente hace referencia al gran obelisco blanco localizado en el extremo al oeste del National Mall de Washington D. C...", "https://cdn1.guias-viajar.com/estados-unidos/wp-content/uploads/2016/10/memorial-washington-005.jpg")
                )
        );

    }
}
