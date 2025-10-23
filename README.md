
# 🧮 **Boucles & Tableaux en Java**

## 📘 Description

Ce document regroupe plusieurs projets Java illustrant des concepts fondamentaux de la programmation :

- Manipulation de tableaux simples et multidimensionnels

- Affichage graphique en console

- Algorithmes classiques : LIS, rotation, fenêtre glissante

- Calculs numériques et séries

- Utilisation de boucles imbriquées, Scanner, et logique algorithmique


## 📂 Project Structure
- projets
- ├── TP2/
- │   └── src/
- │  ----└── Tableau/
- │    -----------└── Tableau.java
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
pour n = 25
### Triangle:
pour n = 5:
pour n = 10:
### TableauCarrés :
pour n = 5 :
pour n = 8 :
### Tableaux de Tableaux :
- input :
```
double[][] t1 = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, };
double[][] t2 = { { 7.0, 8.0, 9.0 }, { 10.0, 11.0, 12.0 } };
double[] t3 = Matrice.sommeLigne(t1);
```
- output :

### RotationMatrice :
pour n = 2 :
pour n = 4 :

### FenetreGlaissante :
pour n = 8 et k = 4 :
- input : 
```
1 2 2 3 2 1 4 2
```
- output :
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
