package x6;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import s5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10295c = new a(new j(16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10297b;

    public a(j jVar) {
        this.f10296a = ((Boolean) jVar.f8445b).booleanValue();
        this.f10297b = (String) jVar.f8446c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i0.m(null, null) && this.f10296a == aVar.f10296a && i0.m(this.f10297b, aVar.f10297b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f10296a), this.f10297b});
    }
}
