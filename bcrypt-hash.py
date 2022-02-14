#Python bcrypt create hashed password

#U ovom primjeru kreiramo hashiranu lozinku

#importamo bcrypt modul nakon što smo ga instalirali
import bcrypt
import time
#spremimo lozinku u password
password = b's$cret12'

start = time.time()

#sol je generirana sa gensalt funkcijom
#Bcrypt faktor troška
salt = bcrypt.gensalt(rounds=16)

#hashirana vrijednost je kreirana sa hashpw funkcijom koja uzima
#tekst lozinke i vrijednost soli kao parametre
hashed = bcrypt.hashpw(password, salt)
end = time.time()

print(end - start)
#nakon što pokrenemo program vidimo kako je sol prvi dio generirane hash vrijednosti
#također se svaki puta generiraju jedinstvene soli i hashirane vrijednosti
print(salt)
print(hashed)

#Provjera lozinke u odnosu na hashiranu vrijednost

#Provjera lozinke se vrši pomoću chechpw funkcije
if bcrypt.checkpw(password, hashed):
    print("match")
else:
   print("doesn't match")
