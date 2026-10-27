## 📌 Présentation du projet

Ce TP a pour objectif de découvrir la gestion de la persistance des données avec JPA, Hibernate et Spring Data JPA dans une application Spring Boot.

L'application permet de gérer des produits et d'effectuer les opérations CRUD.

## 🎯 Objectifs

- Créer un projet Spring Boot avec Spring Initializr.
- Configurer JPA et Hibernate.
- Utiliser la base de données H2.
- Créer une entité JPA `Product`.
- Créer une interface repository avec Spring Data JPA.
- Réaliser les opérations CRUD sur les produits.

## 🛠️ Technologies utilisées

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Spring Web
- Lombok
- IntelliJ IDEA Ultimate
- Maven

## 📦 Entité Product

L'entité `Product` contient les attributs suivants :

| Attribut | Type |
|----------|------|
| id | Long |
| name | String |
| price | double |
| quantity | int |

## ⚙️ Configuration

La configuration de l'application est définie dans le fichier `application.properties`.

La base de données H2 est utilisée pour stocker les produits pendant l'exécution de l'application.

## 🚀 Fonctionnalités

L'application permet de :

- Ajouter un produit.
- Consulter tous les produits.
- Consulter un produit par son identifiant.
- Rechercher des produits.
- Mettre à jour un produit.
- Supprimer un produit.


## ▶️ Exécution du projet

1. Cloner ou télécharger le projet.
2. Ouvrir le projet dans IntelliJ IDEA.
3. Vérifier la configuration du fichier `application.properties`.
4. Charger les dépendances Maven.
5. Exécuter la classe principale Spring Boot.
6. Tester les opérations de gestion des produits.



