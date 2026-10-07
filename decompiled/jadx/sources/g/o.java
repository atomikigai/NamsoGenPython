package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static m0.k b(Configuration configuration) {
        return m0.k.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(m0.k kVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(kVar.c()));
    }

    public static void d(Configuration configuration, m0.k kVar) {
        configuration.setLocales(LocaleList.forLanguageTags(kVar.c()));
    }
}
