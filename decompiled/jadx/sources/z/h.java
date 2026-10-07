package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f10783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f10784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f10785d;
    public final l e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f10786f;

    public h() {
        k kVar = new k();
        kVar.f10832a = 0;
        kVar.f10833b = 0;
        kVar.f10834c = 1.0f;
        kVar.f10835d = Float.NaN;
        this.f10783b = kVar;
        j jVar = new j();
        jVar.f10826a = -1;
        jVar.f10827b = 0;
        jVar.f10828c = -1;
        jVar.f10829d = Float.NaN;
        jVar.e = Float.NaN;
        jVar.f10830f = Float.NaN;
        jVar.f10831g = -1;
        jVar.h = null;
        jVar.i = -1;
        this.f10784c = jVar;
        i iVar = new i();
        iVar.f10788a = false;
        iVar.f10794d = -1;
        iVar.e = -1;
        iVar.f10797f = -1.0f;
        iVar.f10799g = true;
        iVar.h = -1;
        iVar.i = -1;
        iVar.f10803j = -1;
        iVar.f10805k = -1;
        iVar.f10806l = -1;
        iVar.f10808m = -1;
        iVar.f10810n = -1;
        iVar.f10812o = -1;
        iVar.f10814p = -1;
        iVar.f10815q = -1;
        iVar.f10816r = -1;
        iVar.f10817s = -1;
        iVar.f10818t = -1;
        iVar.f10819u = -1;
        iVar.f10820v = -1;
        iVar.f10821w = 0.5f;
        iVar.f10822x = 0.5f;
        iVar.f10823y = null;
        iVar.f10824z = -1;
        iVar.A = 0;
        iVar.B = 0.0f;
        iVar.C = -1;
        iVar.D = -1;
        iVar.E = -1;
        iVar.F = 0;
        iVar.G = 0;
        iVar.H = 0;
        iVar.I = 0;
        iVar.J = 0;
        iVar.K = 0;
        iVar.L = 0;
        iVar.M = Integer.MIN_VALUE;
        iVar.N = Integer.MIN_VALUE;
        iVar.O = Integer.MIN_VALUE;
        iVar.P = Integer.MIN_VALUE;
        iVar.Q = Integer.MIN_VALUE;
        iVar.R = Integer.MIN_VALUE;
        iVar.S = Integer.MIN_VALUE;
        iVar.T = -1.0f;
        iVar.U = -1.0f;
        iVar.V = 0;
        iVar.W = 0;
        iVar.X = 0;
        iVar.Y = 0;
        iVar.Z = 0;
        iVar.f10789a0 = 0;
        iVar.f10791b0 = 0;
        iVar.f10793c0 = 0;
        iVar.f10795d0 = 1.0f;
        iVar.f10796e0 = 1.0f;
        iVar.f10798f0 = -1;
        iVar.f10800g0 = 0;
        iVar.f10801h0 = -1;
        iVar.f10807l0 = false;
        iVar.f10809m0 = false;
        iVar.f10811n0 = true;
        iVar.f10813o0 = 0;
        this.f10785d = iVar;
        l lVar = new l();
        lVar.f10837a = 0.0f;
        lVar.f10838b = 0.0f;
        lVar.f10839c = 0.0f;
        lVar.f10840d = 1.0f;
        lVar.e = 1.0f;
        lVar.f10841f = Float.NaN;
        lVar.f10842g = Float.NaN;
        lVar.h = -1;
        lVar.i = 0.0f;
        lVar.f10843j = 0.0f;
        lVar.f10844k = 0.0f;
        lVar.f10845l = false;
        lVar.f10846m = 0.0f;
        this.e = lVar;
        this.f10786f = new HashMap();
    }

    public final void a(d dVar) {
        i iVar = this.f10785d;
        dVar.e = iVar.h;
        dVar.f10734f = iVar.i;
        dVar.f10736g = iVar.f10803j;
        dVar.h = iVar.f10805k;
        dVar.i = iVar.f10806l;
        dVar.f10740j = iVar.f10808m;
        dVar.f10742k = iVar.f10810n;
        dVar.f10743l = iVar.f10812o;
        dVar.f10745m = iVar.f10814p;
        dVar.f10747n = iVar.f10815q;
        dVar.f10749o = iVar.f10816r;
        dVar.f10755s = iVar.f10817s;
        dVar.f10756t = iVar.f10818t;
        dVar.f10757u = iVar.f10819u;
        dVar.f10758v = iVar.f10820v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = iVar.F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = iVar.G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = iVar.H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = iVar.I;
        dVar.A = iVar.R;
        dVar.B = iVar.Q;
        dVar.f10760x = iVar.N;
        dVar.f10762z = iVar.P;
        dVar.E = iVar.f10821w;
        dVar.F = iVar.f10822x;
        dVar.f10751p = iVar.f10824z;
        dVar.f10753q = iVar.A;
        dVar.f10754r = iVar.B;
        dVar.G = iVar.f10823y;
        dVar.T = iVar.C;
        dVar.U = iVar.D;
        dVar.I = iVar.T;
        dVar.H = iVar.U;
        dVar.K = iVar.W;
        dVar.J = iVar.V;
        dVar.W = iVar.f10807l0;
        dVar.X = iVar.f10809m0;
        dVar.L = iVar.X;
        dVar.M = iVar.Y;
        dVar.P = iVar.Z;
        dVar.Q = iVar.f10789a0;
        dVar.N = iVar.f10791b0;
        dVar.O = iVar.f10793c0;
        dVar.R = iVar.f10795d0;
        dVar.S = iVar.f10796e0;
        dVar.V = iVar.E;
        dVar.f10729c = iVar.f10797f;
        dVar.f10725a = iVar.f10794d;
        dVar.f10727b = iVar.e;
        ((ViewGroup.MarginLayoutParams) dVar).width = iVar.f10790b;
        ((ViewGroup.MarginLayoutParams) dVar).height = iVar.f10792c;
        String str = iVar.k0;
        if (str != null) {
            dVar.Y = str;
        }
        dVar.Z = iVar.f10813o0;
        dVar.setMarginStart(iVar.K);
        dVar.setMarginEnd(iVar.J);
        dVar.a();
    }

    public final Object clone() {
        h hVar = new h();
        i iVar = hVar.f10785d;
        iVar.getClass();
        i iVar2 = this.f10785d;
        iVar.f10788a = iVar2.f10788a;
        iVar.f10790b = iVar2.f10790b;
        iVar.f10792c = iVar2.f10792c;
        iVar.f10794d = iVar2.f10794d;
        iVar.e = iVar2.e;
        iVar.f10797f = iVar2.f10797f;
        iVar.f10799g = iVar2.f10799g;
        iVar.h = iVar2.h;
        iVar.i = iVar2.i;
        iVar.f10803j = iVar2.f10803j;
        iVar.f10805k = iVar2.f10805k;
        iVar.f10806l = iVar2.f10806l;
        iVar.f10808m = iVar2.f10808m;
        iVar.f10810n = iVar2.f10810n;
        iVar.f10812o = iVar2.f10812o;
        iVar.f10814p = iVar2.f10814p;
        iVar.f10815q = iVar2.f10815q;
        iVar.f10816r = iVar2.f10816r;
        iVar.f10817s = iVar2.f10817s;
        iVar.f10818t = iVar2.f10818t;
        iVar.f10819u = iVar2.f10819u;
        iVar.f10820v = iVar2.f10820v;
        iVar.f10821w = iVar2.f10821w;
        iVar.f10822x = iVar2.f10822x;
        iVar.f10823y = iVar2.f10823y;
        iVar.f10824z = iVar2.f10824z;
        iVar.A = iVar2.A;
        iVar.B = iVar2.B;
        iVar.C = iVar2.C;
        iVar.D = iVar2.D;
        iVar.E = iVar2.E;
        iVar.F = iVar2.F;
        iVar.G = iVar2.G;
        iVar.H = iVar2.H;
        iVar.I = iVar2.I;
        iVar.J = iVar2.J;
        iVar.K = iVar2.K;
        iVar.L = iVar2.L;
        iVar.M = iVar2.M;
        iVar.N = iVar2.N;
        iVar.O = iVar2.O;
        iVar.P = iVar2.P;
        iVar.Q = iVar2.Q;
        iVar.R = iVar2.R;
        iVar.S = iVar2.S;
        iVar.T = iVar2.T;
        iVar.U = iVar2.U;
        iVar.V = iVar2.V;
        iVar.W = iVar2.W;
        iVar.X = iVar2.X;
        iVar.Y = iVar2.Y;
        iVar.Z = iVar2.Z;
        iVar.f10789a0 = iVar2.f10789a0;
        iVar.f10791b0 = iVar2.f10791b0;
        iVar.f10793c0 = iVar2.f10793c0;
        iVar.f10795d0 = iVar2.f10795d0;
        iVar.f10796e0 = iVar2.f10796e0;
        iVar.f10798f0 = iVar2.f10798f0;
        iVar.f10800g0 = iVar2.f10800g0;
        iVar.f10801h0 = iVar2.f10801h0;
        iVar.k0 = iVar2.k0;
        int[] iArr = iVar2.f10802i0;
        if (iArr == null || iVar2.f10804j0 != null) {
            iVar.f10802i0 = null;
        } else {
            iVar.f10802i0 = Arrays.copyOf(iArr, iArr.length);
        }
        iVar.f10804j0 = iVar2.f10804j0;
        iVar.f10807l0 = iVar2.f10807l0;
        iVar.f10809m0 = iVar2.f10809m0;
        iVar.f10811n0 = iVar2.f10811n0;
        iVar.f10813o0 = iVar2.f10813o0;
        j jVar = hVar.f10784c;
        jVar.getClass();
        j jVar2 = this.f10784c;
        jVar2.getClass();
        jVar.f10826a = jVar2.f10826a;
        jVar.f10828c = jVar2.f10828c;
        jVar.e = jVar2.e;
        jVar.f10829d = jVar2.f10829d;
        k kVar = this.f10783b;
        int i = kVar.f10832a;
        k kVar2 = hVar.f10783b;
        kVar2.f10832a = i;
        kVar2.f10834c = kVar.f10834c;
        kVar2.f10835d = kVar.f10835d;
        kVar2.f10833b = kVar.f10833b;
        l lVar = hVar.e;
        lVar.getClass();
        l lVar2 = this.e;
        lVar2.getClass();
        lVar.f10837a = lVar2.f10837a;
        lVar.f10838b = lVar2.f10838b;
        lVar.f10839c = lVar2.f10839c;
        lVar.f10840d = lVar2.f10840d;
        lVar.e = lVar2.e;
        lVar.f10841f = lVar2.f10841f;
        lVar.f10842g = lVar2.f10842g;
        lVar.h = lVar2.h;
        lVar.i = lVar2.i;
        lVar.f10843j = lVar2.f10843j;
        lVar.f10844k = lVar2.f10844k;
        lVar.f10845l = lVar2.f10845l;
        lVar.f10846m = lVar2.f10846m;
        hVar.f10782a = this.f10782a;
        return hVar;
    }
}
