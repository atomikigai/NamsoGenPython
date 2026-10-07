package k3;

import bd.s;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f5943a;

    static {
        bd.r rVar = new bd.r();
        Duration durationOfSeconds = Duration.ofSeconds(12L);
        jc.i.d(durationOfSeconds, "ofSeconds(...)");
        long millis = durationOfSeconds.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jc.i.e(timeUnit, "unit");
        rVar.f1651s = cd.b.b(millis, timeUnit);
        Duration durationOfSeconds2 = Duration.ofSeconds(12L);
        jc.i.d(durationOfSeconds2, "ofSeconds(...)");
        long millis2 = durationOfSeconds2.toMillis();
        jc.i.e(timeUnit, "unit");
        rVar.f1652t = cd.b.b(millis2, timeUnit);
        f5943a = new s(rVar);
        t.B(new ub.f("argentina", "AR"), new ub.f("brasil", "BR"), new ub.f("brazil", "BR"), new ub.f("bolivia", "BO"), new ub.f("chile", "CL"), new ub.f("colombia", "CO"), new ub.f("ecuador", "EC"), new ub.f("mexico", "MX"), new ub.f("mxico", "MX"), new ub.f("paraguay", "PY"), new ub.f("peru", "PE"), new ub.f("perú", "PE"), new ub.f("uruguay", "UY"), new ub.f("venezuela", "VE"), new ub.f("espana", "ES"), new ub.f("españa", "ES"), new ub.f("spain", "ES"), new ub.f("estados unidos", "US"), new ub.f("eeuu", "US"), new ub.f("ee-uu", "US"), new ub.f("usa", "US"), new ub.f("reino unido", "GB"), new ub.f("inglaterra", "GB"), new ub.f("uk", "GB"), new ub.f("alemania", "DE"), new ub.f("germany", "DE"), new ub.f("francia", "FR"), new ub.f("france", "FR"), new ub.f("italia", "IT"), new ub.f("italy", "IT"), new ub.f("portugal", "PT"), new ub.f("holanda", "NL"), new ub.f("paises bajos", "NL"), new ub.f("netherlands", "NL"), new ub.f("canada", "CA"), new ub.f("canadá", "CA"), new ub.f("australia", "AU"), new ub.f("japon", "JP"), new ub.f("japón", "JP"), new ub.f("japan", "JP"), new ub.f("china", "CN"), new ub.f("india", "IN"), new ub.f("panama", "PA"), new ub.f("panamá", "PA"), new ub.f("costa rica", "CR"), new ub.f("honduras", "HN"), new ub.f("guatemala", "GT"), new ub.f("el salvador", "SV"), new ub.f("nicaragua", "NI"), new ub.f("cuba", "CU"), new ub.f("republica dominicana", "DO"), new ub.f("república dominicana", "DO"), new ub.f("polonia", "PL"), new ub.f("rusia", "RU"), new ub.f("ucrania", "UA"), new ub.f("turquia", "TR"), new ub.f("turquía", "TR"), new ub.f("egipto", "EG"), new ub.f("marruecos", "MA"));
    }
}
