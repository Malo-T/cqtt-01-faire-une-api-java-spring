# C'est Quoi Ton Truc ?

## Session 01 : Faire une API Java Spring (mais genre on la fait vraiment, pas que la théorie)

### Prérequis

~~Démarrer le docker-compose pour initialiser la base de données.~~  
Le docker-compose qui initialise la base de données est lancé par Spring au démarrage de l'application.  
C'est une base de données de test open source : https://github.com/neondatabase-labs/postgres-sample-dbs?tab=readme-ov-file#employees-database

Normalement les données sont chargées dans la base `employees` sur le schema `employees`, avec le user `postgres`.

### Objectifs

Créer une API REST qui permet de récupérer des informations sur les employés de la base de données.  
Ajouter des fonctionnalités pour ajouter, modifier et supprimer des employés.  