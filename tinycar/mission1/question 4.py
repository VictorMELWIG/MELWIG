tauxTVA = 0.20
marque = (input('Quel est le marque de la voiture?'))
#saisir la marque de la voiture
modele = (input('Quel est la modele de la voiture?'))
#saisir le modele de la voiture
prixht = int(input('Prix de la voiture?'))
#definir le prix d la voiture
prixttc=prixht*(+1+tauxTVA)
#calcul du prix de la voiture avec le taux de la tva

print('La',marque,'modele',modele,'avec le taux TVA coutera',prixttc)