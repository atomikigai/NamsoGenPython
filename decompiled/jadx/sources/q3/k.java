package q3;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import fa.w;
import gb.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q0.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8008d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f8009f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f8010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f8011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f8015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f8016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f8017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f8018z;

    public k(int i, String str, l lVar) {
        Uri uri;
        String host;
        this.f8005a = p.f8023c ? new p() : null;
        this.e = new Object();
        this.f8012t = true;
        int iHashCode = 0;
        this.f8013u = false;
        this.f8014v = false;
        this.f8016x = null;
        this.f8006b = i;
        this.f8007c = str;
        this.f8009f = lVar;
        s sVar = new s();
        sVar.f7938a = 2500;
        this.f8015w = sVar;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f8008d = iHashCode;
    }

    public final void a(String str) {
        if (p.f8023c) {
            this.f8005a.a(str, Thread.currentThread().getId());
        }
    }

    public abstract void b();

    public abstract void c(Object obj);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        return this.f8010r.intValue() - kVar.f8010r.intValue();
    }

    public final void d(String str) {
        w wVar = this.f8011s;
        if (wVar != null) {
            synchronized (((HashSet) wVar.f3866b)) {
                ((HashSet) wVar.f3866b).remove(this);
            }
            synchronized (((ArrayList) wVar.f3871j)) {
                Iterator it = ((ArrayList) wVar.f3871j).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            wVar.c();
        }
        if (p.f8023c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new j(this, str, id2, 0));
            } else {
                this.f8005a.a(str, id2);
                this.f8005a.b(toString());
            }
        }
    }

    public byte[] e() {
        return null;
    }

    public String f() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final String g() {
        String str = this.f8007c;
        int i = this.f8006b;
        if (i == 0 || i == -1) {
            return str;
        }
        return Integer.toString(i) + '-' + str;
    }

    public final boolean h() {
        boolean z4;
        synchronized (this.e) {
            z4 = this.f8014v;
        }
        return z4;
    }

    public final boolean i() {
        boolean z4;
        synchronized (this.e) {
            z4 = this.f8013u;
        }
        return z4;
    }

    public final void j() {
        r rVar;
        synchronized (this.e) {
            rVar = this.f8018z;
        }
        if (rVar != null) {
            rVar.p(this);
        }
    }

    public final void k(com.bumptech.glide.manager.q qVar) {
        r rVar;
        List list;
        synchronized (this.e) {
            rVar = this.f8018z;
        }
        if (rVar != null) {
            b bVar = (b) qVar.f1934c;
            if (bVar != null) {
                if (bVar.e >= System.currentTimeMillis()) {
                    String strG = g();
                    synchronized (rVar) {
                        list = (List) ((HashMap) rVar.f4493a).remove(strG);
                    }
                    if (list != null) {
                        if (q.f8026a) {
                            q.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strG);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((e) rVar.f4494b).f((k) it.next(), qVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            rVar.p(this);
        }
    }

    public abstract com.bumptech.glide.manager.q l(h hVar);

    public final void m() {
        w wVar = this.f8011s;
        if (wVar != null) {
            wVar.c();
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f8008d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i() ? "[X] " : "[ ] ");
        sb2.append(this.f8007c);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append("NORMAL");
        sb2.append(" ");
        sb2.append(this.f8010r);
        return sb2.toString();
    }
}
