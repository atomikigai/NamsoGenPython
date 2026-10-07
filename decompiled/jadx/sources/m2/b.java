package m2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Arrays;
import java.util.WeakHashMap;
import q0.f0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6981a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i) {
        super(cls, str);
        this.f6981a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f6981a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(t.f7026a.H((View) obj));
            case 6:
                WeakHashMap weakHashMap = v0.f7946a;
                return f0.a((View) obj);
            case 7:
                return Float.valueOf(((w8.h) obj).i);
            case 8:
                return Float.valueOf(((w8.h) obj).f9761j);
            case 9:
                return Float.valueOf(((w8.n) obj).b());
            case 10:
                return Float.valueOf(((w8.r) obj).i);
            default:
                return Float.valueOf(((w8.t) obj).f9799j);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f6981a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f6984a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f6985b = iRound;
                int i = eVar.f6988f + 1;
                eVar.f6988f = i;
                if (i == eVar.f6989g) {
                    t.a(eVar.e, eVar.f6984a, iRound, eVar.f6986c, eVar.f6987d);
                    eVar.f6988f = 0;
                    eVar.f6989g = 0;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f6986c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.f6987d = iRound2;
                int i10 = eVar2.f6989g + 1;
                eVar2.f6989g = i10;
                if (eVar2.f6988f == i10) {
                    t.a(eVar2.e, eVar2.f6984a, eVar2.f6985b, eVar2.f6986c, iRound2);
                    eVar2.f6988f = 0;
                    eVar2.f6989g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                t.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                t.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                t.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                t.f7026a.I((View) obj, ((Float) obj2).floatValue());
                break;
            case 6:
                WeakHashMap weakHashMap = v0.f7946a;
                f0.c((View) obj, (Rect) obj2);
                break;
            case 7:
                w8.h hVar = (w8.h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                hVar.i = fFloatValue;
                int i11 = (int) (5400.0f * fFloatValue);
                j1.a aVar = hVar.f9759f;
                float[] fArr = (float[]) hVar.f1775b;
                float f10 = fFloatValue * 1520.0f;
                fArr[0] = (-20.0f) + f10;
                fArr[1] = f10;
                for (int i12 = 0; i12 < 4; i12++) {
                    float f11 = 667;
                    fArr[1] = (aVar.getInterpolation((i11 - w8.h.f9753l[i12]) / f11) * 250.0f) + fArr[1];
                    fArr[0] = (aVar.getInterpolation((i11 - w8.h.f9754m[i12]) / f11) * 250.0f) + fArr[0];
                }
                float f12 = fArr[0];
                float f13 = fArr[1];
                float f14 = ((f13 - f12) * hVar.f9761j) + f12;
                fArr[0] = f14;
                fArr[0] = f14 / 360.0f;
                fArr[1] = f13 / 360.0f;
                w8.j jVar = hVar.f9760g;
                for (int i13 = 0; i13 < 4; i13++) {
                    float f15 = (i11 - w8.h.f9755n[i13]) / 333;
                    if (f15 >= 0.0f && f15 <= 1.0f) {
                        int i14 = i13 + hVar.h;
                        int[] iArr = jVar.f9745c;
                        int length = i14 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int iC = com.bumptech.glide.c.c(iArr[length], ((w8.p) hVar.f1774a).f9779u);
                        int iC2 = com.bumptech.glide.c.c(jVar.f9745c[length2], ((w8.p) hVar.f1774a).f9779u);
                        float interpolation = aVar.getInterpolation(f15);
                        int[] iArr2 = (int[]) hVar.f1776c;
                        Integer numValueOf = Integer.valueOf(iC);
                        Integer numValueOf2 = Integer.valueOf(iC2);
                        int iIntValue = numValueOf.intValue();
                        float f16 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float f17 = (((((iIntValue2 >> 24) & 255) / 255.0f) - f16) * interpolation) + f16;
                        float fPow6 = ((((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3) * interpolation) + fPow3;
                        float fPow7 = ((float) Math.pow(((fPow4 - fPow) * interpolation) + fPow, 0.45454545454545453d)) * 255.0f;
                        float fPow8 = ((float) Math.pow(((fPow5 - fPow2) * interpolation) + fPow2, 0.45454545454545453d)) * 255.0f;
                        iArr2[0] = Integer.valueOf(Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(f17 * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        ((w8.p) hVar.f1774a).invalidateSelf();
                    }
                    break;
                }
                ((w8.p) hVar.f1774a).invalidateSelf();
                break;
            case 8:
                ((w8.h) obj).f9761j = ((Float) obj2).floatValue();
                break;
            case 9:
                w8.n nVar = (w8.n) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (nVar.f9777s != fFloatValue2) {
                    nVar.f9777s = fFloatValue2;
                    nVar.invalidateSelf();
                }
                break;
            case 10:
                w8.r rVar = (w8.r) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                rVar.i = fFloatValue3;
                float[] fArr2 = (float[]) rVar.f1775b;
                fArr2[0] = 0.0f;
                float f18 = ((int) (fFloatValue3 * 333.0f)) / 667;
                j1.a aVar2 = rVar.e;
                float interpolation2 = aVar2.getInterpolation(f18);
                fArr2[2] = interpolation2;
                fArr2[1] = interpolation2;
                float interpolation3 = aVar2.getInterpolation(f18 + 0.49925038f);
                fArr2[4] = interpolation3;
                fArr2[3] = interpolation3;
                fArr2[5] = 1.0f;
                if (rVar.h && interpolation3 < 1.0f) {
                    int[] iArr3 = (int[]) rVar.f1776c;
                    iArr3[2] = iArr3[1];
                    iArr3[1] = iArr3[0];
                    iArr3[0] = com.bumptech.glide.c.c(rVar.f9789f.f9745c[rVar.f9790g], ((w8.p) rVar.f1774a).f9779u);
                    rVar.h = false;
                }
                ((w8.p) rVar.f1774a).invalidateSelf();
                break;
            default:
                w8.t tVar = (w8.t) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                tVar.f9799j = fFloatValue4;
                int i15 = (int) (fFloatValue4 * 1800.0f);
                for (int i16 = 0; i16 < 4; i16++) {
                    ((float[]) tVar.f1775b)[i16] = Math.max(0.0f, Math.min(1.0f, tVar.f9797f[i16].getInterpolation((i15 - w8.t.f9794m[i16]) / w8.t.f9793l[i16])));
                }
                if (tVar.i) {
                    Arrays.fill((int[]) tVar.f1776c, com.bumptech.glide.c.c(tVar.f9798g.f9745c[tVar.h], ((w8.p) tVar.f1774a).f9779u));
                    tVar.i = false;
                }
                ((w8.p) tVar.f1774a).invalidateSelf();
                break;
        }
    }
}
