package r4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.KickoffActivity;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8147a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8148b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8150d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f8151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f8152g;

    public d(e eVar) {
        this.f8152g = eVar;
        this.f8151f = eVar;
        Set set = e.f8153c;
        this.f8149c = R.style.FirebaseUI_DefaultMaterialTheme;
        this.f8150d = true;
        this.e = true;
    }

    public final Intent a() {
        ArrayList arrayList = this.f8147a;
        if (arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            if (!e.f8153c.contains("password") && !e.f8154d.contains("password")) {
                throw new IllegalArgumentException("Unknown provider: ".concat("password"));
            }
            arrayList.add(new c("password", bundle));
        }
        n9.g gVar = this.f8151f.f8157a;
        gVar.a();
        Context context = gVar.f7359a;
        n9.g gVar2 = this.f8152g.f8157a;
        gVar2.a();
        s4.c cVar = new s4.c(gVar2.f7360b, arrayList, null, this.f8149c, this.f8148b, null, null, this.f8150d, this.e, false, false, false, null, null, null);
        int i = KickoffActivity.P;
        return u4.c.t(context, KickoffActivity.class, cVar);
    }

    public final void b(ArrayList arrayList) {
        int i = 0;
        if (arrayList.size() == 1 && ((c) arrayList.get(0)).f8145a.equals("anonymous")) {
            throw new IllegalStateException("Sign in as guest cannot be the only sign in method. In this case, sign the user in anonymously your self; no UI is needed.");
        }
        ArrayList arrayList2 = this.f8147a;
        arrayList2.clear();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (arrayList2.contains(cVar)) {
                throw new IllegalArgumentException(q1.a.m(new StringBuilder("Each provider can only be set once. "), cVar.f8145a, " was set twice."));
            }
            arrayList2.add(cVar);
        }
    }
}
