# Backend des universites

Projet Spring Boot distinct du dossier Devoir 5. Il reprend les couches et les exemples REST des ateliers en utilisant les entites `Universite` et `Systeme` du devoir.

## Configuration

- Java 17 et Maven
- MySQL local
- Base `spring_DB`, creee automatiquement par l'URL JDBC
- Utilisateur MySQL configure sur `root` dans `src/main/resources/application.properties`
- Si MySQL utilise un mot de passe, ajouter `spring.datasource.password=...` dans ce fichier

## Lancer

Depuis ce dossier :

```powershell
mvn spring-boot:run
```

## API REST

Le contexte `/produits` et les routes `/api` suivent l'atelier REST.

- `GET http://localhost:8081/produits/api` : toutes les universites
- `GET http://localhost:8081/produits/api/{id}` : une universite
- `POST http://localhost:8081/produits/api` : ajouter
- `PUT http://localhost:8081/produits/api` : modifier
- `DELETE http://localhost:8081/produits/api/{id}` : supprimer
- `GET http://localhost:8081/produits/api/prodscat/{idSysteme}` : universites d'un systeme
- `GET http://localhost:8081/produits/api/sys` : tous les systemes
- `GET http://localhost:8081/produits/api/sys/{id}` : un systeme
- `GET http://localhost:8081/produits/rest` : Spring Data REST

Un objet universite utilise les champs `nomUniversite`, `prixUniversite`, `dateCreation` (`YYYY-MM-DD`) et `systeme` (au minimum `idSysteme` pour associer un systeme existant).

Nom du projet Eclipse/Maven : universities_3.

