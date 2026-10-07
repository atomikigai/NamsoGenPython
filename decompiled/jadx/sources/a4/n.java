package a4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements u3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f164d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f166g;
    public int h;

    public n(URL url) {
        r rVar = o.f167a;
        p4.f.c(url, "Argument must not be null");
        this.f163c = url;
        this.f164d = null;
        p4.f.c(rVar, "Argument must not be null");
        this.f162b = rVar;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        if (this.f166g == null) {
            this.f166g = c().getBytes(u3.f.f8847a);
        }
        messageDigest.update(this.f166g);
    }

    public final String c() {
        String str = this.f164d;
        if (str != null) {
            return str;
        }
        URL url = this.f163c;
        p4.f.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f165f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.f164d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f163c;
                    p4.f.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f165f = new URL(this.e);
        }
        return this.f165f;
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (c().equals(nVar.c()) && this.f162b.equals(nVar.f162b)) {
                return true;
            }
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.f162b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public n(String str) {
        r rVar = o.f167a;
        this.f163c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f164d = str;
            p4.f.c(rVar, "Argument must not be null");
            this.f162b = rVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
