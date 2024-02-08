#Author: karim
Feature: Tunisanet HomePage

  Background: 
    Given Admin is on HomePage

  @smoke
  Scenario: Recherche un produit sur le site Tunisianet
    And Admin clic on menu "Stockage" and clic on submenu "Disque SSD"
    Then Admin clic on product "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    And Admin is directed to another page and clic on "Ajouter Au Panier"
    And Admin clic on "Commander"
    Then Admin clic on "Commander"

@smoke2
  Scenario: chercher un produit
    Given Admin clic on search "Film De Protection Nano Glass 9H Pour Samsung A12"
    Then Admin clic "submit_search"
