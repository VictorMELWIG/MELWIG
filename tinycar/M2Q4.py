#remise standard si le prixTTC dépasse 20k euros
remise = 0.10  # 10%

#saisie du mot de passe pour accéder au programme
mdp = input('Veuillez saisir votre mdp: ')

if mdp == 'leroux':
    #saisie des informations de la voiture
    marque = input('Quelle est la marque de la voiture ? ')
    modele = input('Quel est le modèle de la voiture ? ')
    voitureElec = input('Est-ce que la voiture est électrique ? (oui/non) ').lower()
    
    #détermination du taux de TVA en fonction de la voiture
    if voitureElec == 'oui':
        tauxTVA = 0.05  #TVA à 5% pour les voitures électriques
    else:
        tauxTVA = 0.20  #TVA à 20% pour les voitures non électriques

    #calcul du prix TTC de la voiture
    prixht = float(input('Prix de la voiture (HT) ? '))
    prixttc = prixht * (1 + tauxTVA)
    
    #affichage du prix TTC avant réduction
    print('Le prix TTC avant toute réduction est :', prixttc, 'euros')

    #demande du type de carte de fidélité
    print('Veuillez choisir une option de carte de fidélité:')
    print('1- Sans carte')
    print('2- Avec carte gold')
    print('3- Avec carte platinium')
    choix_carte = input('Votre choix (1/2/3) : ')

    #application des réductions en fonction du type de carte
    if choix_carte == '2':  #carte Gold
        if voitureElec == 'oui':
            reduction_gold = 0.30  #30% de réduction si voiture électrique
        else:
            reduction_gold = 0.15  #15% de réduction pour les autres voitures
        prixttc = prixttc * (1 - reduction_gold)
        print('Une réduction de', reduction_gold * 100, '% a été appliquée pour la carte Gold')

    elif choix_carte == '3':  #carte platinium
        reduction_platinium = 0.20  #20% de réduction
        prixttc = prixttc * (1 - reduction_platinium)
        print('Une réduction de', reduction_platinium * 100, '% a été appliquée pour la carte platinium')

    #application de la remise standard si le prix TTC dépasse 20k euros
    if prixttc > 20000:
        prixttc = prixttc * (1 - remise)
        print('Une remise supplémentaire de', remise * 100, '% a été appliquée car le prix dépasse 20000 euros')

    #affichage du prix final après toutes les réductions
    print('La', marque, 'modèle', modele, 'avec le taux de TVA coûtera', prixttc, 'euros')

else:
    print('Mot de passe incorrect')
