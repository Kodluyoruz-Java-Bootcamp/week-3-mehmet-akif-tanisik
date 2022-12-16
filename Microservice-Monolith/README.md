
## Mikroservis ve Monolith Mimari Karşılaştırması
<hr>

## Monolith Mimari

### Monolitik uygulamaların dezavantajları:

- Zamanla çok büyür ve bu nedenle yönetilmesi zorlaşır.

- Küçük bir değişiklik için bile tüm uygulamayı yeniden değiştirmeniz gerekebilir.

- Uygulamanın boyutu arttıkça başlatma ve dağıtım süresi de artar.

- Projeye katılan herhangi bir yeni geliştirici için, sorumluluğu tek bir işlevsellikle ilgili olsa bile, büyük bir Monolitik uygulamanın mantığını anlamak çok zordur.

- Uygulamanın tek bir bölümü büyük bir yük/trafikle karşı karşıya kalsa bile, tüm uygulamanın örneklerini birden çok sunucuya dağıtmamız gerekir. Çok verimsizdir ve gereksiz yere daha fazla kaynak tüketir. Bu nedenle, yekpare uygulamalarda yatay ölçeklendirme mümkün değildir.

- Hem zaman hem de maliyet açısından tüm uygulamayı etkilediğinden, belirli bir işlevselliğe çok uygun herhangi bir yeni teknolojiyi benimsemek çok zordur.

- Herhangi bir modüldeki tek bir hata tüm yekpare uygulamayı çökertebileceğinden çok güvenilir değildir.


### Monolitik uygulamaların avantajları:

- Hizmetleri tanımlamak ve geliştirmek için yetenekli geliştiricilerin gerekli olduğu mikro hizmetlere göre geliştirmesi basittir.

- Yalnızca tek bir jar/war dosyası dağıtılacağı için dağıtım daha kolaydır.

- Mikroservis mimarisine kıyasla geliştirmesi nispeten daha kolay ve basittir.

- Ağ gecikmesi ve güvenlik sorunları, mikroservis mimarisine kıyasla nispeten daha azdır.

- Geliştiricilerin farklı uygulamaları öğrenmelerine gerek yoktur, tek bir uygulamaya odaklanabilirler.

<hr>

## Mikroservis Mimari

### Mikroservislerin dezavantajları:

- Dağıtılmış bir sistem olduğundan monolitik uygulamalardan çok daha karmaşıktır. Karmaşıklığı, bir dizi mikroservis artışla birlikte artar.

- Nitelikli geliştiricilerin, mikroservisleri tanımlayabilen ve aralarındaki iletişimi yönetebilen mikroservis mimarisiyle çalışması gerekir.

- Mikroservislerin bağımsız dağıtımı karmaşıktır.

- Mikroservislerin, birbirleriyle etkileşime girmeleri gerektiğinden ağ kullanımı açısından maliyetlidir ve tüm bu uzak aramalar ağ gecikmesine neden olur.

- Mikroservisler, ağ üzerinden hizmetler arası iletişim nedeniyle yekpare uygulamalara göre daha az güvenlidir.

- Kontrol birçok Mikroservis üzerinden aktığı için hata ayıklama zordur ve hatanın tam olarak neden ve nerede meydana geldiğini belirtmek zor bir iştir.

### Mikroservislerin avantajları:

- Nispeten daha küçük olduğu için yönetimi kolaydır.

- Mikroservislerin birinde herhangi bir güncelleme varsa, yalnızca o mikro hizmeti yeniden değiştirmeniz yeterlidir.

- Mikroservisler bağımsızdır ve bu nedenle bağımsız olarak dağıtılır. Başlatma ve devreye alma süreleri nispeten daha kısadır.

- Yeni bir geliştiricinin, tüm sistemi değil, yalnızca üzerinde çalışacağı işlevselliği sağlayan belirli bir Mikroservisi anlaması gerektiğinden, projeye katılması çok kolaydır.

- Belirli bir Mikroservis, kullanıcıların bu işlevi aşırı kullanması nedeniyle büyük bir yükle karşı karşıyaysa, o zaman yalnızca bu Mikroservisi ölçeklendirmemiz gerekir. Bu nedenle, Mikroservis mimarisi yatay ölçeklendirmeyi destekler.

- Her Mikroservis, iş gereksinimlerine göre farklı teknolojiler kullanabilir.

- Belirli bir Mikroservis bir hata nedeniyle çökerse, diğer Mikroservisleri etkilemez ve tüm sistem bozulmadan kalır ve kullanıcılara başka işlevler sağlamaya devam eder.