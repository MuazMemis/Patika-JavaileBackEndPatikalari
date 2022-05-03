package com.muazmemis.cdi;

import javax.inject.Named;

// Kapsam
// Yaşam Süresi
// Perfomansı etkiler +-
@Named
//@ApplicationScoped // bütün uygulama boyunca çalışyıor. Server kapanınca destroy olur.
//@RequestScoped // sadece bir requestte çalışıyor.
//@SessionScoped // Bir kullanıc için yaşar ancak logout. With impl Serializable
//@Dependent // Bukelemon. Çağırdığımız sınıfın özelliklerini kullanır.
//@ConversationScoped // Belirlibir istek boyunca yaşar.
//@Singleton // Bir bean instance olmasını sağlamak için
public class _00_Scoped {


}
