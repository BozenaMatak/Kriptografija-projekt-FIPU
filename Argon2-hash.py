from argon2 import PasswordHasher
ph = PasswordHasher()
hash = ph.hash("correct horse battery staple")
print(hash)
check = ph.verify(hash, "correct horse battery staple")
print(check)
#True

#False
check = ph.verify(hash, "gasfghst425r4r")
print(check)
