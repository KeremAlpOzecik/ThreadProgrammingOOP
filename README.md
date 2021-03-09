# ThreadProgramignOOP
SORU 1. Aşağıda açıklanan uygulamayı Java dilinde gerçekleştiriniz.
Problemin Genel Tanımı:
MxN (M satır, N sütun) boyutunda bir matris ile NxP (N satır, P sütun) boyutundaki diğer bir
matrisin çarpılması (MxP (M satır, P sütun) boyutunda sonuç matrisi oluşur) Java iş parçaları
ile şu şekilde yapılmak isteniyor: Birinci matrisin bir satırı ile ikinci matrisin tamamı bir iş
parçasına verilerek sonuç matrisin bir kısmı oluşturulacaktır. Bu şekilde, ilk matrisin satır
sayısı kadar iş parçası oluşturularak çarpma işlemi tamamlanmış olacaktır. Sonuç matris, ilgili
metotları senkronize olarak tanımlanmış bir tampon sahada (buffer) her iş parçasının kendisi
ile ilgili kısmı oluşturması yolu ile elde edilmiş olacaktır.
Detaylar:
* Matrisler matris1.txt ve matris2.txt isimlerindeki metin (text) dosyalarında sayılar arasında
birer boşluk bırakarak yazılmış halde verilecektir:

#### Matris1.txt 
2 8 9 
1 3 5
#### Matris2.txt
6 5
8 7
3 5
Örneğin, ustteki 2x3 ve 3x2 matrisleri içeren txt
 dosyaları gibi...
* Tampon saha için bir Buffer sınıfı yazınız. Buffer sınıfı yapıcı (constructor) metodunda
sonuç matrisine ilişkin satır ve sütun sayılarını alsın ve sonucun yerleşeceği iki boyutu diziyi
(sonuç matrisini) bu satır ve sütun sayılarına göre oluştursun. Buffer sınıfı içinde put metodu
olmalıdır; put metodu ilgili iş parçası tarafından sonuç matrisinin bir hücresine sonuç yazmak
için kullanılabilir. Put metodunu synchronized olarak tanımlayınız. Put metodunun
parametrelerini siz uygun şekilde belirleyebilirsiniz. Ayrıca, sonuç matrisinin tümünü
yazdırmak için print metodu da ekleyiniz.
* MultiplyWorker isimli iş parçası (Thread) yazınız. Bu iş parçası yukarıda genel problem
tanımında belirtildiği gibi, buffer, ilk matrisin ilgili satırı, ikinci matris ve ihtiyacınız olan
diğer değişkenleri (gerekiyorsa row indeks gibi) yapıcı metoduna parametre olarak alabilir.
Run metodunda ilgili iş parçasının görevi dahilinde kısmi sonuçlar elde edilerek buffer'da
ilgili yerlere aktarılacaktır.
* Bir deneme programı yazarak, main metodunda, dosyalardan girdi olarak gelen iki matrisi
alınız, buffer' nesnesini ve ilk matrisin satır sayısı kadar iş parçasını oluşturunuz ve iş
parçalarını başlatınız. Sonra, tüm iş parçalarının bitmesini bekledikten sonra buffer'ı 
yazdırarak main metodun sonlanmasını sağlayınız. (Thread oluşturma, çalıştırma için Java'da
yeni sürümlerde gelen servisleri (ThreadExecutor gibi) kullanmak zorunda değilsiniz.)
SORU 2. Aşağıda açıklanan tasarım deseni ile ilgili uygulamayı Java dilinde gerçekleştiriniz.
Elimizde istediğiniz veri yapısında tutabileceğiniz (dizi, liste, vb.) tamsayı değerler vardır.
Sınav için veri sayısının maksimum 100 olduğunu düşünebilir ve rastgele sayı üreterek bu
verileri oluşturabilirsiniz. Bu verileri üç farklı algoritma kullanarak sıralamak istiyoruz, diğer
deyiş ile çalışma zamanında istediğimiz algoritmayı seçme şansı elde etmek istiyoruz. Bu üç
algoritma, "BubbleSort", "QuickSort (recursive yazabilirsiniz)" ve "InsertionSort"
algoritmalarıdır. Bu uygulamayı uygun tasarım desenini kullanarak gerçekleştiriniz.
Kullanacağınız tasarım deseninde (client) tarafı içinde deneme amaçlı olarak üç algoritmanın
da seçilerek verilere uygulanmasını gösteriniz (her uygulamadan sonra verileri sıralı
yazdırabilirsiniz) ve ayrıca her sıralama algoritması için çalışma zaman ölçümü de yapınız
(Date() ile veya currentTimeMilis, vb biçimde ölçebilirsiniz. (Factory deseni kullanmak
zorunda değilsiniz.)
NOTLAR:
* Her iki soruda istenen tüm sınıfları tek bir NetBeans projesi içinde yazınız. Projeyi
"compress" edilmiş halde ve Ad_Soyad_Numara..rar gibi isimlendirerek Ege Derste son hafta
kısmında açılan final yükleme klasörüne yükleyiniz.
* Her iki soru için ayrı ayrı Soru1Deneme ve Soru2Deneme sınıfları yazabilirsiniz, kontrol
sırasında bu sınıfların main metotları çalıştırılacaktır.
* Girdi dosyaları için kendi bilgisayarınıza özel "path" vermeniz durumunda kod
çalışmayacaktır.
* Olası ek duyuru/güncellemeler için Ege Dersi takip ediniz.
* Sistem kaynaklı sorun olabileceğini göz önüne alarak yükleme işlemini son ana
bırakmayınız. Projenizi her ihtimale karşı kendi lokal depolama ortamınızda da saklayınız.
Son yükleme tarih ve saati, 11 Şubat Perşembe saat 23:55'tir.
* Bu bireysel olarak cevaplanacak bir sınavdır. Üniversite senatosunun da belirttiği gibi,
benzerlikler incelenecek ve başka bir öğrenciden alıntı tespiti durumunda bölüm
başkanlığı kanalı ile üniversitenin resmi disiplin prosedürleri uygulanacaktır.
