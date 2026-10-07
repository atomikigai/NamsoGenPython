package r3;

import com.bumptech.glide.manager.q;
import java.io.UnsupportedEncodingException;
import q3.h;
import q3.k;
import q3.l;
import q3.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {
    public final Object A;
    public m B;

    public g(String str, m mVar, l lVar) {
        super(0, str, lVar);
        this.A = new Object();
        this.B = mVar;
    }

    @Override // q3.k
    public final void b() {
        synchronized (this.e) {
            this.f8013u = true;
            this.f8009f = null;
        }
        synchronized (this.A) {
            this.B = null;
        }
    }

    @Override // q3.k
    public final void c(Object obj) {
        m mVar;
        String str = (String) obj;
        synchronized (this.A) {
            mVar = this.B;
        }
        if (mVar != null) {
            mVar.e(str);
        }
    }

    @Override // q3.k
    public final q l(h hVar) {
        String str;
        byte[] bArr = hVar.f7998b;
        try {
            str = new String(bArr, android.support.v4.media.session.a.q("ISO-8859-1", hVar.f7999c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new q(str, android.support.v4.media.session.a.p(hVar));
    }
}
