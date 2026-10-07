package n2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7189d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7191g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f7192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7193k;

    public i() {
        this.f7186a = new Matrix();
        this.f7187b = new ArrayList();
        this.f7188c = 0.0f;
        this.f7189d = 0.0f;
        this.e = 0.0f;
        this.f7190f = 1.0f;
        this.f7191g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.f7192j = new Matrix();
        this.f7193k = null;
    }

    @Override // n2.j
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7187b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // n2.j
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f7187b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((j) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.f7192j;
        matrix.reset();
        matrix.postTranslate(-this.f7189d, -this.e);
        matrix.postScale(this.f7190f, this.f7191g);
        matrix.postRotate(this.f7188c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f7189d, this.i + this.e);
    }

    public String getGroupName() {
        return this.f7193k;
    }

    public Matrix getLocalMatrix() {
        return this.f7192j;
    }

    public float getPivotX() {
        return this.f7189d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f7188c;
    }

    public float getScaleX() {
        return this.f7190f;
    }

    public float getScaleY() {
        return this.f7191g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f7189d) {
            this.f7189d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.e) {
            this.e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f7188c) {
            this.f7188c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f7190f) {
            this.f7190f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f7191g) {
            this.f7191g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.h) {
            this.h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.i) {
            this.i = f10;
            c();
        }
    }

    public i(i iVar, r.e eVar) {
        k gVar;
        this.f7186a = new Matrix();
        this.f7187b = new ArrayList();
        this.f7188c = 0.0f;
        this.f7189d = 0.0f;
        this.e = 0.0f;
        this.f7190f = 1.0f;
        this.f7191g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f7192j = matrix;
        this.f7193k = null;
        this.f7188c = iVar.f7188c;
        this.f7189d = iVar.f7189d;
        this.e = iVar.e;
        this.f7190f = iVar.f7190f;
        this.f7191g = iVar.f7191g;
        this.h = iVar.h;
        this.i = iVar.i;
        String str = iVar.f7193k;
        this.f7193k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(iVar.f7192j);
        ArrayList arrayList = iVar.f7187b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof i) {
                this.f7187b.add(new i((i) obj, eVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.e = 0.0f;
                    hVar2.f7180g = 1.0f;
                    hVar2.h = 1.0f;
                    hVar2.i = 0.0f;
                    hVar2.f7181j = 1.0f;
                    hVar2.f7182k = 0.0f;
                    hVar2.f7183l = Paint.Cap.BUTT;
                    hVar2.f7184m = Paint.Join.MITER;
                    hVar2.f7185n = 4.0f;
                    hVar2.f7178d = hVar.f7178d;
                    hVar2.e = hVar.e;
                    hVar2.f7180g = hVar.f7180g;
                    hVar2.f7179f = hVar.f7179f;
                    hVar2.f7196c = hVar.f7196c;
                    hVar2.h = hVar.h;
                    hVar2.i = hVar.i;
                    hVar2.f7181j = hVar.f7181j;
                    hVar2.f7182k = hVar.f7182k;
                    hVar2.f7183l = hVar.f7183l;
                    hVar2.f7184m = hVar.f7184m;
                    hVar2.f7185n = hVar.f7185n;
                    gVar = hVar2;
                } else if (obj instanceof g) {
                    gVar = new g((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f7187b.add(gVar);
                Object obj2 = gVar.f7195b;
                if (obj2 != null) {
                    eVar.put(obj2, gVar);
                }
            }
        }
    }
}
