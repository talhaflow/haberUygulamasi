# haberUygulamasi


Bu, Firebase ve Kotlin ile geliştirilmiş basit bir haber okuma uygulamasıdır. Uygulama, kullanıcılara güncel haber başlıklarını ve içeriklerini görüntüleme imkanı sağlar.


## Özellikler

- Güncel haber başlıklarını ve içeriklerini çekme ve görüntüleme.
- Haber detaylarına tıklanarak tam haber içeriğini görüntüleme.
- Kullanıcıların haberleri kaydetme ve daha sonra offline okuma olanağı.

## Gereksinimler

- Android Studio (versiyon 3.x veya üstü)
- Firebase hesabı ve proje oluşturma

## Kurulum

1. Bu repo'yu klonlayın veya zip olarak indirin.
2. Android Studio'yu açın ve projeyi içe aktarın.
3. Firebase konsolunda yeni bir proje oluşturun ve Firebase projenizin google-services.json dosyasını indirin.
4. google-services.json dosyasını projenizin `app` klasörü altına ekleyin.
5. Firebase konsolunda Authentication servisini etkinleştirin ve gerekli kimlik doğrulama yöntemlerini ayarlayın (Google, E-posta vb.).
6. Firebase konsolunda Firestore Database'i etkinleştirin.
7. Firestore'da bir koleksiyon oluşturun ve haber verilerini içerecek belirli alanları tanımlayın (örn: başlık, içerik, tarih vb.).
8. Uygulamanızda Firebase ile kimlik doğrulama ve Firestore entegrasyonunu gerçekleştirmek için gerekli adımları takip edin. (Firebase Authentication ve Firestore bağlantısı kurma)

## Kullanım

- Uygulama başlatıldığında, güncel haber başlıkları Firebase Firestore'dan çekilecek ve ana ekran üzerinde listelenecektir.
- Bir haber başlığına tıkladığınızda, haberin tamamını görüntülemek için ayrıntılar ekranına yönlendirileceksiniz.

## Katkıda Bulunma

Eğer projeye katkıda bulunmak isterseniz, "pull request" yaparak katkılarınızı ekleyebilirsiniz. Öneri ve düzeltmeleri memnuniyetle karşılıyoruz!


