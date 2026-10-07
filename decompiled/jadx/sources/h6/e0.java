package h6;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f4986b;

    public e0(f0 f0Var, String str) {
        this.f4986b = f0Var;
        this.f4985a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f4986b) {
            try {
                ArrayList arrayList = this.f4986b.f4988b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = this.f4985a;
                    HashMap map = ((d0) obj).f4982a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        ((n0) d6.p.C.f2982g.zzi()).d(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
