package r3;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import q3.h;
import q3.k;
import q3.l;
import q3.m;
import q3.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k {
    public final Object A;
    public m B;
    public final String C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, String str, JSONObject jSONObject, m mVar, l lVar) {
        super(i, str, lVar);
        String string = jSONObject != null ? jSONObject.toString() : null;
        this.A = new Object();
        this.B = mVar;
        this.C = string;
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
        synchronized (this.A) {
            mVar = this.B;
        }
        if (mVar != null) {
            mVar.e(obj);
        }
    }

    @Override // q3.k
    public final byte[] e() {
        String str = this.C;
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Log.wtf("Volley", q.a("Unsupported Encoding while trying to get the bytes of %s using %s", str, "utf-8"));
            return null;
        }
    }

    @Override // q3.k
    public final String f() {
        return "application/json; charset=utf-8";
    }

    @Override // q3.k
    public final com.bumptech.glide.manager.q l(h hVar) {
        try {
            return new com.bumptech.glide.manager.q(new JSONObject(new String(hVar.f7998b, android.support.v4.media.session.a.q("utf-8", hVar.f7999c))), android.support.v4.media.session.a.p(hVar));
        } catch (UnsupportedEncodingException e) {
            return new com.bumptech.glide.manager.q(new q3.a(e));
        } catch (JSONException e4) {
            return new com.bumptech.glide.manager.q(new q3.a(e4));
        }
    }
}
