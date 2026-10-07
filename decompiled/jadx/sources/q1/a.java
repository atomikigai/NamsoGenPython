package q1;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.j;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzgyc;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.p002firebaseauthapi.zzajs;
import com.google.android.gms.internal.p002firebaseauthapi.zzzo;
import com.google.android.gms.internal.play_billing.zzep;
import com.google.android.recaptcha.internal.zzhh;
import da.v;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import u.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int A(int i, int i10, int i11) {
        return zzhh.zzy(i) + i10 + i11;
    }

    public static /* synthetic */ String B(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static final void a(View view, int i) {
        int iD = e.d(i);
        if (iD == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (i0.D(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iD == 1) {
            if (i0.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iD == 2) {
            if (i0.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iD != 3) {
            return;
        }
        if (i0.D(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(v.f(i, "Unknown visibility "));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static int d(int i, int i10, int i11) {
        return j.y(i) + i10 + i11;
    }

    public static int e(int i, int i10, int i11, int i12) {
        return j.z(i) + i10 + i11 + i12;
    }

    public static zzzo f(Integer num, ByteBuffer byteBuffer) {
        return zzzo.zzb(byteBuffer.putInt(num.intValue()).array());
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object h(zzbl zzblVar, int i, List list, int i10) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i10);
    }

    public static String i(int i, int i10, String str, String str2) {
        return str + i + str2 + i10;
    }

    public static String j(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String k(String str, s sVar, String str2) {
        return str + sVar + str2;
    }

    public static String l(StringBuilder sb2, long j4, String str) {
        sb2.append(j4);
        sb2.append(str);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void o(int i, String str, String str2) {
        zzdt.zzf(str2, str + i);
    }

    public static void p(int i, HashMap map, String str, int i10, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i10));
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void r(String str, SparseArray sparseArray, int i, String str2, int i10) {
        sparseArray.put(i, Collections.singletonList(str));
        sparseArray.put(i10, Collections.singletonList(str2));
    }

    public static void s(String str, String str2, String str3) {
        zzdt.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static int t(int i, int i10, int i11) {
        return zzgyc.zzD(i) + i10 + i11;
    }

    public static int u(int i, int i10, int i11, int i12) {
        return ((i * i10) / i11) + i12;
    }

    public static int v(int i, int i10, int i11) {
        int i12 = i / i10;
        return i12 + i12 + i11;
    }

    public static int w(int i, int i10, int i11, int i12) {
        return zzki.zzx(i) + i10 + i11 + i12;
    }

    public static int x(int i, int i10, int i11) {
        return zzajs.zzA(i) + i10 + i11;
    }

    public static int y(int i, int i10, int i11) {
        return zzki.zzx(i) + i10 + i11;
    }

    public static int z(int i, int i10, int i11) {
        return zzep.zzC(i) + i10 + i11;
    }
}
