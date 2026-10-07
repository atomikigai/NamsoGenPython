package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import bd.u;
import h6.o0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jd.d f4552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r.j f4553b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f4552a = new l();
        } else if (i >= 28) {
            f4552a = new k();
        } else if (i >= 26) {
            f4552a = new j();
        } else {
            Method method = i.f4560c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f4552a = new i();
            } else {
                f4552a = new h();
            }
        }
        f4553b = new r.j(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, g0.e eVar, Resources resources, int i, String str, int i10, int i11, g0.b bVar, boolean z4) {
        Typeface typefaceJ;
        Typeface typefaceCreate;
        int i12 = 2;
        int i13 = -3;
        if (eVar instanceof g0.h) {
            g0.h hVar = (g0.h) eVar;
            String str2 = hVar.f4143d;
            typefaceJ = null;
            boolean z10 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.webkit.b(i12, bVar, typefaceCreate));
                }
                return typefaceCreate;
            }
            int i14 = 1;
            Object[] objArr3 = !z4 ? bVar != null : hVar.f4142c != 0;
            int i15 = z4 ? hVar.f4141b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            a5.b bVar2 = new a5.b(15);
            bVar2.f188b = bVar;
            u uVar = hVar.f4140a;
            o0 o0Var = new o0(13, bVar2, handler);
            int i16 = 14;
            if (objArr3 == true) {
                r.j jVar = n0.f.f7140a;
                String str3 = ((String) uVar.f1679f) + "-" + i11;
                Typeface typeface = (Typeface) n0.f.f7140a.get(str3);
                if (typeface != null) {
                    handler.post(new a3.e(bVar2, typeface, i16, z10));
                    typefaceJ = typeface;
                } else if (i15 == -1) {
                    n0.e eVarA = n0.f.a(str3, context, uVar, i11);
                    o0Var.m(eVarA);
                    typefaceJ = eVarA.f7138a;
                } else {
                    try {
                        try {
                            n0.e eVar2 = (n0.e) n0.f.f7141b.submit(new n0.c(str3, context, uVar, i11, 0)).get(i15, TimeUnit.MILLISECONDS);
                            o0Var.m(eVar2);
                            typefaceJ = eVar2.f7138a;
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e4) {
                            throw new RuntimeException(e4);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) o0Var.f5062c).post(new androidx.emoji2.text.j((a5.b) o0Var.f5061b, i13, 4));
                    }
                }
            } else {
                r.j jVar2 = n0.f.f7140a;
                String str4 = ((String) uVar.f1679f) + "-" + i11;
                Typeface typeface2 = (Typeface) n0.f.f7140a.get(str4);
                if (typeface2 != null) {
                    handler.post(new a3.e(bVar2, typeface2, i16, objArr2 == true ? 1 : 0));
                    typefaceJ = typeface2;
                } else {
                    n0.d dVar = new n0.d(o0Var, objArr == true ? 1 : 0);
                    synchronized (n0.f.f7142c) {
                        try {
                            r.k kVar = n0.f.f7143d;
                            ArrayList arrayList = (ArrayList) kVar.get(str4);
                            if (arrayList != null) {
                                arrayList.add(dVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(dVar);
                                kVar.put(str4, arrayList2);
                                n0.c cVar = new n0.c(str4, context, uVar, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = n0.f.f7141b;
                                n0.d dVar2 = new n0.d(str4, i14);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                b3.b bVar3 = new b3.b(6);
                                bVar3.f1367c = cVar;
                                bVar3.f1366b = dVar2;
                                bVar3.f1368d = handler2;
                                threadPoolExecutor.execute(bVar3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceJ = f4552a.j(context, (g0.f) eVar, resources, i11);
            if (bVar != null) {
                if (typefaceJ != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.webkit.b(i12, bVar, typefaceJ));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceJ != null) {
            f4553b.put(b(resources, i, str, i10, i11), typefaceJ);
        }
        return typefaceJ;
    }

    public static String b(Resources resources, int i, String str, int i10, int i11) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i10 + '-' + i + '-' + i11;
    }
}
