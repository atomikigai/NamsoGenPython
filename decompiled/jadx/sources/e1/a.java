package e1;

import a2.l;
import android.os.SystemClock;
import android.view.Choreographer;
import da.v;
import e7.i;
import java.util.ArrayList;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f3179a;

    public a(l lVar) {
        this.f3179a = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x012f  */
    /* JADX WARN: Code duplicated, block: B:38:0x013c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    /* JADX WARN: Code duplicated, block: B:45:0x016c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172 A[LOOP:1: B:43:0x0166->B:47:0x0172, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0184  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        long j10;
        long j11;
        float f10;
        int i;
        float f11;
        f fVar;
        boolean z4;
        ArrayList arrayList;
        ThreadLocal threadLocal;
        b bVar;
        ArrayList arrayList2;
        int iIndexOf;
        int i10;
        int size;
        float f12;
        b bVar2 = (b) ((i) this.f3179a.f43b).f3489b;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList3 = bVar2.f3182b;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        boolean z10 = false;
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            e eVar = (e) arrayList3.get(i11);
            if (eVar == null) {
                i = i11;
            } else {
                k kVar = bVar2.f3181a;
                Long l2 = (Long) kVar.get(eVar);
                if (l2 == null) {
                    j10 = eVar.f3198g;
                    if (j10 == 0) {
                        eVar.f3198g = jUptimeMillis;
                        eVar.a(eVar.f3194b);
                        i = i11;
                    } else {
                        j11 = jUptimeMillis - j10;
                        eVar.f3198g = jUptimeMillis;
                        f10 = Float.MAX_VALUE;
                        if (eVar.f3202m) {
                            f12 = eVar.f3201l;
                            if (f12 != Float.MAX_VALUE) {
                                eVar.f3200k.i = f12;
                                eVar.f3201l = Float.MAX_VALUE;
                            }
                            eVar.f3194b = (float) eVar.f3200k.i;
                            eVar.f3193a = 0.0f;
                            eVar.f3202m = z10;
                            i = i11;
                            f10 = Float.MAX_VALUE;
                        } else {
                            if (eVar.f3201l != Float.MAX_VALUE) {
                                f fVar2 = eVar.f3200k;
                                double d10 = fVar2.i;
                                i = i11;
                                long j12 = j11 / 2;
                                d dVarA = fVar2.a(eVar.f3194b, eVar.f3193a, j12);
                                f fVar3 = eVar.f3200k;
                                fVar3.i = eVar.f3201l;
                                eVar.f3201l = Float.MAX_VALUE;
                                d dVarA2 = fVar3.a(dVarA.f3185a, dVarA.f3186b, j12);
                                eVar.f3194b = dVarA2.f3185a;
                                eVar.f3193a = dVarA2.f3186b;
                            } else {
                                i = i11;
                                d dVarA3 = eVar.f3200k.a(eVar.f3194b, eVar.f3193a, j11);
                                eVar.f3194b = dVarA3.f3185a;
                                eVar.f3193a = dVarA3.f3186b;
                            }
                            float fMax = Math.max(eVar.f3194b, -3.4028235E38f);
                            eVar.f3194b = fMax;
                            float fMin = Math.min(fMax, f10);
                            eVar.f3194b = fMin;
                            f11 = eVar.f3193a;
                            fVar = eVar.f3200k;
                            fVar.getClass();
                            if (Math.abs(f11) < fVar.e) {
                            }
                            z4 = false;
                            float fMin2 = Math.min(eVar.f3194b, f10);
                            eVar.f3194b = fMin2;
                            float fMax2 = Math.max(fMin2, -3.4028235E38f);
                            eVar.f3194b = fMax2;
                            eVar.a(fMax2);
                            if (z4) {
                                arrayList = eVar.i;
                                eVar.f3197f = false;
                                threadLocal = b.f3180f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                bVar = (b) threadLocal.get();
                                bVar.f3181a.remove(eVar);
                                arrayList2 = bVar.f3182b;
                                iIndexOf = arrayList2.indexOf(eVar);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    bVar.e = true;
                                }
                                eVar.f3198g = 0L;
                                eVar.f3195c = false;
                                for (i10 = 0; i10 < arrayList.size(); i10++) {
                                    if (arrayList.get(i10) == null) {
                                        throw v.e(arrayList, i10);
                                    }
                                }
                                for (size = arrayList.size() - 1; size >= 0; size--) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z4 = true;
                        float fMin3 = Math.min(eVar.f3194b, f10);
                        eVar.f3194b = fMin3;
                        float fMax3 = Math.max(fMin3, -3.4028235E38f);
                        eVar.f3194b = fMax3;
                        eVar.a(fMax3);
                        if (z4) {
                            arrayList = eVar.i;
                            eVar.f3197f = false;
                            threadLocal = b.f3180f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new b());
                            }
                            bVar = (b) threadLocal.get();
                            bVar.f3181a.remove(eVar);
                            arrayList2 = bVar.f3182b;
                            iIndexOf = arrayList2.indexOf(eVar);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                bVar.e = true;
                            }
                            eVar.f3198g = 0L;
                            eVar.f3195c = false;
                            while (i10 < arrayList.size()) {
                                if (arrayList.get(i10) == null) {
                                    throw v.e(arrayList, i10);
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (l2.longValue() < jUptimeMillis2) {
                    kVar.remove(eVar);
                    j10 = eVar.f3198g;
                    if (j10 == 0) {
                        eVar.f3198g = jUptimeMillis;
                        eVar.a(eVar.f3194b);
                        i = i11;
                    } else {
                        j11 = jUptimeMillis - j10;
                        eVar.f3198g = jUptimeMillis;
                        f10 = Float.MAX_VALUE;
                        if (eVar.f3202m) {
                            f12 = eVar.f3201l;
                            if (f12 != Float.MAX_VALUE) {
                                eVar.f3200k.i = f12;
                                eVar.f3201l = Float.MAX_VALUE;
                            }
                            eVar.f3194b = (float) eVar.f3200k.i;
                            eVar.f3193a = 0.0f;
                            eVar.f3202m = z10;
                            i = i11;
                            f10 = Float.MAX_VALUE;
                        } else {
                            if (eVar.f3201l != Float.MAX_VALUE) {
                                f fVar4 = eVar.f3200k;
                                double d11 = fVar4.i;
                                i = i11;
                                long j13 = j11 / 2;
                                d dVarA4 = fVar4.a(eVar.f3194b, eVar.f3193a, j13);
                                f fVar5 = eVar.f3200k;
                                fVar5.i = eVar.f3201l;
                                eVar.f3201l = Float.MAX_VALUE;
                                d dVarA5 = fVar5.a(dVarA4.f3185a, dVarA4.f3186b, j13);
                                eVar.f3194b = dVarA5.f3185a;
                                eVar.f3193a = dVarA5.f3186b;
                            } else {
                                i = i11;
                                d dVarA6 = eVar.f3200k.a(eVar.f3194b, eVar.f3193a, j11);
                                eVar.f3194b = dVarA6.f3185a;
                                eVar.f3193a = dVarA6.f3186b;
                            }
                            float fMax4 = Math.max(eVar.f3194b, -3.4028235E38f);
                            eVar.f3194b = fMax4;
                            float fMin4 = Math.min(fMax4, f10);
                            eVar.f3194b = fMin4;
                            f11 = eVar.f3193a;
                            fVar = eVar.f3200k;
                            fVar.getClass();
                            if (Math.abs(f11) < fVar.e || Math.abs(fMin4 - ((float) fVar.i)) >= fVar.f3206d) {
                                z4 = false;
                            } else {
                                eVar.f3194b = (float) eVar.f3200k.i;
                                eVar.f3193a = 0.0f;
                            }
                            float fMin5 = Math.min(eVar.f3194b, f10);
                            eVar.f3194b = fMin5;
                            float fMax5 = Math.max(fMin5, -3.4028235E38f);
                            eVar.f3194b = fMax5;
                            eVar.a(fMax5);
                            if (z4) {
                                arrayList = eVar.i;
                                eVar.f3197f = false;
                                threadLocal = b.f3180f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                bVar = (b) threadLocal.get();
                                bVar.f3181a.remove(eVar);
                                arrayList2 = bVar.f3182b;
                                iIndexOf = arrayList2.indexOf(eVar);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    bVar.e = true;
                                }
                                eVar.f3198g = 0L;
                                eVar.f3195c = false;
                                while (i10 < arrayList.size()) {
                                    if (arrayList.get(i10) == null) {
                                        throw v.e(arrayList, i10);
                                    }
                                }
                                while (size >= 0) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z4 = true;
                        float fMin6 = Math.min(eVar.f3194b, f10);
                        eVar.f3194b = fMin6;
                        float fMax6 = Math.max(fMin6, -3.4028235E38f);
                        eVar.f3194b = fMax6;
                        eVar.a(fMax6);
                        if (z4) {
                            arrayList = eVar.i;
                            eVar.f3197f = false;
                            threadLocal = b.f3180f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new b());
                            }
                            bVar = (b) threadLocal.get();
                            bVar.f3181a.remove(eVar);
                            arrayList2 = bVar.f3182b;
                            iIndexOf = arrayList2.indexOf(eVar);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                bVar.e = true;
                            }
                            eVar.f3198g = 0L;
                            eVar.f3195c = false;
                            while (i10 < arrayList.size()) {
                                if (arrayList.get(i10) == null) {
                                    throw v.e(arrayList, i10);
                                }
                            }
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    i = i11;
                }
            }
            i11 = i + 1;
            z10 = false;
        }
        if (bVar2.e) {
            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                if (arrayList3.get(size2) == null) {
                    arrayList3.remove(size2);
                }
            }
            bVar2.e = false;
        }
        if (arrayList3.size() > 0) {
            if (bVar2.f3184d == null) {
                bVar2.f3184d = new l(bVar2.f3183c);
            }
            l lVar = bVar2.f3184d;
            ((Choreographer) lVar.f44c).postFrameCallback((a) lVar.f45d);
        }
    }
}
