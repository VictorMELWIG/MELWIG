remise = 0.1
mdp = input('Veuillez saisir votre mdp: ')
if mdp == 'leroux':
    marque = input('Quel est la marque de la voiture? ')
    #saisir la marque de la voiture
    modele = input('Quel est le modele de la voiture? ')
    #saisir le modèle de la voiture
    voitureElec = input('Est-ce que la voiture est électrique? (oui/non) ')
    #on demande si la voiture est électrique
    if voitureElec.lower() == 'oui':
        tauxTVA = 0.05  
    #correction du taux TVA pour les voitures électriques (5%)
    else:
        tauxTVA = 0.20  
    #taux TVA normal
    prixht = int(input('Prix de la voiture? '))
    #définir le prix de la voiture
    prixttc = prixht * (1 + tauxTVA)
    #calcul du prix de la voiture avec le taux de TVA
    if prixttc > 20000:
        prixttc = (1 - remise) * prixttc
    #application de la remise si le prix TTC dépasse 20 000
    print('La', marque, 'modèle', modele, 'avec le taux TVA coûtera', prixttc, 'euros avec remise.')
else :
    print('Mdp incorrect')
