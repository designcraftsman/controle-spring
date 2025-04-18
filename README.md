# 🎯 Fonctionnalités – Mini Service de Gestion de Campagnes de Dons

Ce projet implémente une API REST permettant de gérer des campagnes de dons et d’enregistrer les transactions associées.

---

## ✅ Fonctionnalités principales

### 📌 Entités JPA
- **Campagne** : contient les informations de base sur une campagne (nom, objectif, dates).
- **Don** : représente un don lié à une campagne donnée.

---

### 📌 Repositories
- `CampagneRepository` : interface JPA pour accéder aux campagnes.
- `DonRepository` : interface JPA pour gérer les dons.

---

### 📌 DTO
- `DonDTO` : objet de transfert de données pour enregistrer et récupérer les dons.

---

### 📌 Projection
- `CampagneResume` : projection pour afficher uniquement les informations essentielles d'une campagne active.

---

### 📌 Services
- `ServiceCampagne` : permet de récupérer les campagnes actives (en fonction de la date actuelle).
- `ServiceDon` : permet d'enregistrer un don et de transformer l'entité Don en DonDTO.

---

### 📌 API REST
- `GET /api/campagnes/actives` : retourne la liste des campagnes actives.
- `POST /api/campagnes/{id}/dons` : enregistre un don pour une campagne spécifique.

---

### 📌 Validation & Gestion d’erreurs
- Utilisation de `@Valid` pour valider les champs du don :
  - `nomDonateur` ne doit pas être vide.
  - `montant` doit être supérieur à 0.
- Gestion des erreurs centralisée avec `@ControllerAdvice`.

---

### 📌 Tests
- **Test unitaire** du service `ServiceCampagne`.

