package x6;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f10302b = new d(new Bundle());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f10303a;

    public /* synthetic */ d(Bundle bundle) {
        this.f10303a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Bundle bundle = ((d) obj).f10303a;
        Bundle bundle2 = this.f10303a;
        if (bundle2 == null || bundle == null) {
            return bundle2 == bundle;
        }
        if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!i0.m(bundle2.get(str), bundle.get(str))) {
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10303a});
    }
}
