tauxTVA = 0.196
prixht = 20
qte = int(input('Quantité?'))
remise = 0.1
prixttc = prixht * (1+tauxTVA)*qte
if qte>100:
    print('Vous avez 10% de remise')
else: 
    print('Vous avez pas de remise')
if qte>100 :
        prixttc=(1-remise)*prixttc
print(prixttc)
