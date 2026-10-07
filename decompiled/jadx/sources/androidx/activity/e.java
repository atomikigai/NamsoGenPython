package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.h0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f351b;

    public /* synthetic */ e(Object obj, int i) {
        this.f350a = i;
        this.f351b = obj;
    }

    @Override // f2.c
    public final Bundle a() {
        switch (this.f350a) {
            case 0:
                m mVar = (m) this.f351b;
                Bundle bundle = new Bundle();
                h hVar = mVar.f373w;
                hVar.getClass();
                HashMap map = hVar.f397b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f399d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f401g.clone());
                return bundle;
            default:
                return h0.a((h0) this.f351b);
        }
    }
}
