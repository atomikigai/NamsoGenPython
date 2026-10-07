package r7;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e, u3.g, yb.h, q4.a {
    @Override // q4.a
    public Object g() {
        try {
            return new y3.e(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // r7.e
    public d k(Context context, String str, c cVar) {
        int iC;
        d dVar = new d();
        int iG = cVar.g(context, str);
        dVar.f8196a = iG;
        int i = 1;
        int i10 = 0;
        if (iG != 0) {
            iC = cVar.c(context, str, false);
            dVar.f8197b = iC;
        } else {
            iC = cVar.c(context, str, true);
            dVar.f8197b = iC;
        }
        int i11 = dVar.f8196a;
        if (i11 == 0) {
            if (iC == 0) {
                i = 0;
            }
            dVar.f8198c = i;
            return dVar;
        }
        i10 = i11;
        if (i10 >= iC) {
            i = -1;
        }
        dVar.f8198c = i;
        return dVar;
    }

    @Override // u3.g
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
