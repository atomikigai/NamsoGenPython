package b9;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f1440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r8.a f1441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f1442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f1443d;
    public ColorStateList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f1445g;
    public final float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint.Style f1453q;

    public f(k kVar) {
        this.f1442c = null;
        this.f1443d = null;
        this.e = null;
        this.f1444f = PorterDuff.Mode.SRC_IN;
        this.f1445g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f1447k = 255;
        this.f1448l = 0.0f;
        this.f1449m = 0.0f;
        this.f1450n = 0;
        this.f1451o = 0;
        this.f1452p = 0;
        this.f1453q = Paint.Style.FILL_AND_STROKE;
        this.f1440a = kVar;
        this.f1441b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f1442c = null;
        this.f1443d = null;
        this.e = null;
        this.f1444f = PorterDuff.Mode.SRC_IN;
        this.f1445g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.f1447k = 255;
        this.f1448l = 0.0f;
        this.f1449m = 0.0f;
        this.f1450n = 0;
        this.f1451o = 0;
        this.f1452p = 0;
        this.f1453q = Paint.Style.FILL_AND_STROKE;
        this.f1440a = fVar.f1440a;
        this.f1441b = fVar.f1441b;
        this.f1446j = fVar.f1446j;
        this.f1442c = fVar.f1442c;
        this.f1443d = fVar.f1443d;
        this.f1444f = fVar.f1444f;
        this.e = fVar.e;
        this.f1447k = fVar.f1447k;
        this.h = fVar.h;
        this.f1451o = fVar.f1451o;
        this.i = fVar.i;
        this.f1448l = fVar.f1448l;
        this.f1449m = fVar.f1449m;
        this.f1450n = fVar.f1450n;
        this.f1452p = fVar.f1452p;
        this.f1453q = fVar.f1453q;
        if (fVar.f1445g != null) {
            this.f1445g = new Rect(fVar.f1445g);
        }
    }
}
