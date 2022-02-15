# Kriptografija-projekt-FIPU
Komparacija više kriptografskih algoritama na primjeru sigurne pohrane lozinki

Tema projekta iz kolegija Kriptografije je bila Komparacija više kriptografskih algoritama na primjeru sigurne pohrane lozinku.
Napravljena je usporedba algoritama Argon2, Bcrypt i PBKDF2.

Argon2 je kriptografski algoritam za hashiranje koji se najviše preporučuje za hashiranje lozinki te je
proglašen pobjednikom na natjecanju između 2012. i 2015. ao najsigurniji algoritam za hashiranje lozinki. 
Ključne značajke: izvedba, otpornost na kompromis, skalabilnost, paralelizam, dodatna podrška za unos.

Bcrypt - Hash funkcija koju su dizajnirali Niels Provos i David Mazieres 1999. godine
temelji se na složenoj simetričnoj blok šifri Blowfish koju je dizajnirao Bruce Schneier.
Razvijen da učvrsti pohranu lozinki Unix autentifikacijskog sustava.
Može pratiti rastuću snagu hardvera jer se može konfigurirati da bude sporiji, povećanjem broja iteracija.

PBKDF2 - Funkcija deriviranja ključa lozinke koja je osmišljena da bude algoritamski spora kako bi učinkovitost „Rainbow” tablica bila reducirana. 
Opisan i uveden u internetski standard RFC 2898 (PKCS #5).
Broj iteracija je jedan od najvažnijih parametara PBDKF2 algoritma – odabir većeg broja ponavljanja usporava napadača.


Argon2 – memorijski sigurniji, optimiziran za jasnoću i učinkovitost te pruža najveću zaštitu od napadača.

PBKDF2 – sigurnija varijanta nakon Argon2 pruža veću zaštitu u obrani od ASIC-a i GPU-ova.

Bcrypt – već pomalo zastario i znatno je sporiji zbog Blowfish složene simetrične blok šifre.

U svrhu sigurne pohrane lozinki preporuča se korištenje Argon2, kao alternativa se preporuča PBKDF2, a Bcrypt preostaje kao zadnja opcija.


Repozitorij sadrži prikaze implementacija sva 3 algoritma.
Implementacija PBKDF2 je napravljenja u Intellij programu pomoću Jave. Kod je preuzet sa stranice: https://medium.com/@kasunpdh/how-to-store-passwords-securely-with-pbkdf2-204487f14e84
Za implementaciju Argon2 algoritma korištena je stranica - https://pypi.org/project/argon2-cffi/
Za implementaciju Bcrypta korištena je stranica - https://howtodoinjava.com/modules/python-bcrypt-hash-password/







