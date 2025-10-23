
# 🧮 **Boucles & Tableaux en Java**

## 📘 Description

Ce document regroupe plusieurs projets Java illustrant des concepts fondamentaux de la programmation :

- Manipulation de tableaux simples et multidimensionnels

- Affichage graphique en console

- Algorithmes : rotation, fenêtre glissante

- Calculs numériques et séries

- Utilisation de boucles imbriquées, Scanner, et logique algorithmique


## 📂 Project Structure
- projets
- ├── Triangle/
- │   └── src/
- │       ----└── triangle/
- │           -----------└── Triangle.java
- ├── Matrice/
- │   └── src/
- │       ----└── tableauDeTableaux/
- │           -----------├── Matrice.java
- │           -----------└── TestMatrice.java
- ├── TableauCarrés/
- │   └── src/
- │       ----└── tableauDesCarrés/
- │           -----------└── TableauCarrés.java
- ├── RotationMatrice/
- │   └── src/
- │       ----└── rotationMatrice/
- │           -----------├── Rotation90.java
- │           -----------└── TesterRotation.java
- ├── laSomme/
- │   └── src/
- │       ----└── laSomme/
- │           -----------└── Somme.java
- ├── FenetreGlaissante/
- │   └── src/
- │       ----└── fenetreGlaissante/
- │           -----------└── FenetreGlaissante.java
- └── README.md

## ⚙️ Features

###  **1.** Triangle – Affichage en forme pyramidale
Recherche des éléments pivots dans un tableau

- Affiche un triangle d’étoiles centré selon le nombre de lignes donné

###  **2.** Matrice – Tableaux de Tableaux

- Affichage de matrices

- Vérification de régularité

- Somme des lignes

- Addition de deux matrices régulières

**Méthodes :**
- afficher(double[][] t)
- regulier(double[][] t)
- sommeLigne(double[][] t)
- somme(double[][] t1, double[][] t2)

###  **3.** TableauCarrés – Carrés des nombres impairs
Génère les carrés des nombres impairs selon la formule (2i + 1)^2

**Méthodes :**
- tableauCarrés(int n, int[] t) → int[]

###  **4.** RotationMatrice – Rotation de matrice carrée
Rotation d’une matrice carrée à 90° et 180° en place

**Méthodes :**
- rotate90ClockwiseInPlace(int[][] M)
- rotate180InPlace(int[][] M)
- afficher(int[][] A)

###  **5.** laSomme – Calcul d’une somme harmonique
Calcule la somme de la série : 1 + 1/1 + 1/2 + ... + 1/(n-1)

**Méthodes :**
- Boucle simple avec accumulation en float

###  **6.** FenetreGlaissante – Comptage des éléments distincts
Pour chaque fenêtre de taille k, affiche le nombre d’éléments distincts

**Méthodes :**
- elmentsDistict(int[] t, int k)

## 🖥️ Example Execution

### somme :
pour n = 5
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/55cec60f-a0c7-4118-9e43-bb5755b1cfed" />
pour n = 25
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/f6f1aa85-178c-4e7d-8fa5-70b5d63787a0" />
### Triangle:
pour n = 5:
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/3bc2487a-e693-4e66-afb9-7ba4ff066491" />
pour n = 10:
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/140a7190-5385-4555-ac77-44923db41284" />
### TableauCarrés :
pour n = 5 :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/81ab708c-921c-49f3-b042-572ae38afdfb" />
pour n = 8 :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/55ed3ece-ecbd-4fee-818c-4b4d8f5e61e2" />
### Tableaux de Tableaux :
- input :
```
double[][] t1 = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, };
double[][] t2 = { { 7.0, 8.0, 9.0 }, { 10.0, 11.0, 12.0 } };
```
- output :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/76a3253d-19fd-4898-b5a3-18d8f58bd685" />

### RotationMatrice :
pour n = 2 :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/9b0c7fe8-ca8a-4b4a-bacc-ac1d743014ec" />
pour n = 4 :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/a7d8ebc7-da14-4d33-a4a0-7d9ab761f921" />
### FenetreGlaissante :
pour n = 8 et k = 4 :
- input : 
```
1 2 2 3 2 1 4 2
```
- output :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/c0b18342-0c3e-4e5c-84d4-308173984686" />
## 💡 Concepts Practiced

- Boucles imbriquées et logique de comparaison

- Manipulation de tableaux 1D et 2D

- Algorithmes de recherche, somme, rotation, et comptage

- Interface console interactive

- Organisation modulaire des fichiers Java
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Fondamentaux et Concepts Avancés de la Programmation Java – TP1
- 🎓 Instructor	Mr.LACHGAR
- 📅 18	October 2025
