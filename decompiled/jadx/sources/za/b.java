package za;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f11535b;

    public /* synthetic */ b(c cVar, int i) {
        this.f11534a = i;
        this.f11535b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ab.b bVarF;
        ab.b bVarG;
        switch (this.f11534a) {
            case 0:
                this.f11535b.a();
                return;
            case 1:
                c cVar = this.f11535b;
                Object obj = c.f11536m;
                synchronized (obj) {
                    try {
                        n9.g gVar = cVar.f11537a;
                        gVar.a();
                        s5.j jVarA = s5.j.a(gVar.f7359a);
                        try {
                            bVarF = cVar.f11539c.F();
                            if (jVarA != null) {
                                jVarA.y();
                            }
                        } catch (Throwable th) {
                            if (jVarA != null) {
                                jVarA.y();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = bVarF.f273b;
                    if (i == 5) {
                        bVarG = cVar.g(bVarF);
                    } else {
                        if (i == 3) {
                            bVarG = cVar.g(bVarF);
                        } else if (!cVar.f11540d.a(bVarF)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarF);
                        }
                    }
                    synchronized (obj) {
                        try {
                            n9.g gVar2 = cVar.f11537a;
                            gVar2.a();
                            s5.j jVarA2 = s5.j.a(gVar2.f7359a);
                            try {
                                cVar.f11539c.B(bVarG);
                                if (jVarA2 != null) {
                                    jVarA2.y();
                                }
                            } catch (Throwable th3) {
                                if (jVarA2 != null) {
                                    jVarA2.y();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.f11544k.size() != 0 && !TextUtils.equals(bVarF.f272a, bVarG.f272a)) {
                                Iterator it = cVar.f11544k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (bVarG.f273b == 4) {
                        String str = bVarG.f272a;
                        synchronized (cVar) {
                            cVar.f11543j = str;
                        }
                    }
                    int i10 = bVarG.f273b;
                    if (i10 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i10 == 2 || i10 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e) {
                    cVar.h(e);
                    return;
                }
            default:
                this.f11535b.a();
                return;
        }
    }
}
