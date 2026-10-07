package n2;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bb.b f7178d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bb.b f7179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7180g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f7183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f7184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f7185n;

    @Override // n2.j
    public final boolean a() {
        return this.f7179f.d() || this.f7178d.d();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // n2.j
    public final boolean b(int[] iArr) {
        boolean z4;
        bb.b bVar = this.f7179f;
        boolean z10 = true;
        if (bVar.d()) {
            ColorStateList colorStateList = (ColorStateList) bVar.f1526d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != bVar.f1524b) {
                bVar.f1524b = colorForState;
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        bb.b bVar2 = this.f7178d;
        if (bVar2.d()) {
            ColorStateList colorStateList2 = (ColorStateList) bVar2.f1526d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != bVar2.f1524b) {
                bVar2.f1524b = colorForState2;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z4 | z10;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f7179f.f1524b;
    }

    public float getStrokeAlpha() {
        return this.f7180g;
    }

    public int getStrokeColor() {
        return this.f7178d.f1524b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f7181j;
    }

    public float getTrimPathOffset() {
        return this.f7182k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i) {
        this.f7179f.f1524b = i;
    }

    public void setStrokeAlpha(float f10) {
        this.f7180g = f10;
    }

    public void setStrokeColor(int i) {
        this.f7178d.f1524b = i;
    }

    public void setStrokeWidth(float f10) {
        this.e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f7181j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f7182k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.i = f10;
    }
}
