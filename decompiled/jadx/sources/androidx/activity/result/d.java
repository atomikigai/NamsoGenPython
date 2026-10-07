package androidx.activity.result;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.d f390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f391d;

    public /* synthetic */ d(g gVar, String str, com.bumptech.glide.d dVar, int i) {
        this.f388a = i;
        this.f391d = gVar;
        this.f389b = str;
        this.f390c = dVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        switch (this.f388a) {
            case 0:
                g gVar = this.f391d;
                HashMap map = gVar.f397b;
                String str = this.f389b;
                Integer num = (Integer) map.get(str);
                com.bumptech.glide.d dVar = this.f390c;
                if (num != null) {
                    gVar.f399d.add(str);
                    try {
                        gVar.b(num.intValue(), dVar, obj);
                        return;
                    } catch (Exception e) {
                        gVar.f399d.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + dVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                g gVar2 = this.f391d;
                HashMap map2 = gVar2.f397b;
                String str2 = this.f389b;
                Integer num2 = (Integer) map2.get(str2);
                com.bumptech.glide.d dVar2 = this.f390c;
                if (num2 != null) {
                    gVar2.f399d.add(str2);
                    try {
                        gVar2.b(num2.intValue(), dVar2, obj);
                        return;
                    } catch (Exception e4) {
                        gVar2.f399d.remove(str2);
                        throw e4;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + dVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f391d.f(this.f389b);
    }
}
