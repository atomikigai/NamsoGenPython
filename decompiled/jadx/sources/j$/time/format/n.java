package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5465f = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f5466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5469d;
    public int e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.f5524a;
        map.put('Q', hVar);
        map.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f5531a);
    }

    public n() {
        this.f5466a = this;
        this.f5468c = new ArrayList();
        this.e = -1;
        this.f5467b = null;
        this.f5469d = false;
    }

    public n(n nVar) {
        this.f5466a = this;
        this.f5468c = new ArrayList();
        this.e = -1;
        this.f5467b = nVar;
        this.f5469d = true;
    }

    public final void g(j$.time.temporal.q qVar, int i) {
        Objects.requireNonNull(qVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        f(new i(qVar, i, i, u.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.q qVar, int i, int i10, u uVar) {
        if (i == i10 && uVar == u.NOT_NEGATIVE) {
            g(qVar, i10);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i);
        }
        f(new i(qVar, i, i10, uVar));
    }

    public final void f(i iVar) {
        i iVarA;
        n nVar = this.f5466a;
        int i = nVar.e;
        if (i < 0) {
            nVar.e = b(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) nVar.f5468c).get(i);
        int i10 = iVar.f5452b;
        int i11 = iVar.f5453c;
        if (i10 == i11 && iVar.f5454d == u.NOT_NEGATIVE) {
            iVarA = iVar2.b(i11);
            b(iVar.a());
            this.f5466a.e = i;
        } else {
            iVarA = iVar2.a();
            this.f5466a.e = b(iVar);
        }
        ((ArrayList) this.f5466a.f5468c).set(i, iVarA);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        b(new m(aVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c(char c10) {
        b(new d(c10));
    }

    public final void d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new l(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        e eVar = dateTimeFormatter.f5437a;
        if (eVar.f5447b) {
            eVar = new e(eVar.f5446a, false);
        }
        b(eVar);
    }

    public final void j() {
        n nVar = this.f5466a;
        nVar.e = -1;
        this.f5466a = new n(nVar);
    }

    public final void i() {
        n nVar = this.f5466a;
        if (nVar.f5467b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) nVar.f5468c).size() > 0) {
            n nVar2 = this.f5466a;
            e eVar = new e(nVar2.f5468c, nVar2.f5469d);
            this.f5466a = this.f5466a.f5467b;
            b(eVar);
            return;
        }
        this.f5466a = this.f5466a.f5467b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f5466a;
        nVar.getClass();
        ((ArrayList) nVar.f5468c).add(fVar);
        n nVar2 = this.f5466a;
        nVar2.e = -1;
        return ((ArrayList) nVar2.f5468c).size() - 1;
    }

    public final DateTimeFormatter k(t tVar, j$.time.chrono.m mVar) {
        return l(Locale.getDefault(), tVar, mVar);
    }

    public final DateTimeFormatter l(Locale locale, t tVar, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f5466a.f5467b != null) {
            i();
        }
        e eVar = new e(this.f5468c, false);
        s sVar = s.f5478a;
        return new DateTimeFormatter(eVar, locale, tVar, mVar);
    }
}
