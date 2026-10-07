package n2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f7197p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f7198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f7199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f7200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f7201d;
    public Paint e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f7202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f7203g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f7207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f7208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r.e f7209o;

    public l() {
        this.f7200c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f7204j = 0.0f;
        this.f7205k = 0.0f;
        this.f7206l = 255;
        this.f7207m = null;
        this.f7208n = null;
        this.f7209o = new r.e(0);
        this.f7203g = new i();
        this.f7198a = new Path();
        this.f7199b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i iVar, Matrix matrix, Canvas canvas, int i, int i10) {
        int i11;
        float f10;
        int i12;
        Matrix matrix2 = iVar.f7186a;
        ArrayList arrayList = iVar.f7187b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f7186a;
        matrix3.preConcat(iVar.f7192j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            j jVar = (j) arrayList.get(i13);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i, i10);
            } else {
                if (jVar instanceof k) {
                    k kVar = (k) jVar;
                    float f11 = i / this.f7204j;
                    float f12 = i10 / this.f7205k;
                    float fMin = Math.min(f11, f12);
                    Matrix matrix4 = this.f7200c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    boolean z4 = c10;
                    i11 = i13;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f13 = (fArr[z4 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f13) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f7198a;
                        path.reset();
                        h0.f[] fVarArr = kVar.f7194a;
                        if (fVarArr != null) {
                            h0.f.b(fVarArr, path);
                        }
                        Path path2 = this.f7199b;
                        path2.reset();
                        if (kVar instanceof g) {
                            path2.setFillType(kVar.f7196c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            h hVar = (h) kVar;
                            float f14 = hVar.i;
                            if (f14 != 0.0f || hVar.f7181j != 1.0f) {
                                float f15 = hVar.f7182k;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (hVar.f7181j + f15) % 1.0f;
                                if (this.f7202f == null) {
                                    this.f7202f = new PathMeasure();
                                }
                                this.f7202f.setPath(path, z4);
                                float length = this.f7202f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path.reset();
                                if (f18 > f19) {
                                    this.f7202f.getSegment(f18, length, path, true);
                                    f10 = 0.0f;
                                    this.f7202f.getSegment(0.0f, f19, path, true);
                                } else {
                                    f10 = 0.0f;
                                    this.f7202f.getSegment(f18, f19, path, true);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix4);
                            bb.b bVar = hVar.f7179f;
                            float f20 = 255.0f;
                            if (((Shader) bVar.f1525c) == null && bVar.f1524b == 0) {
                                f20 = 255.0f;
                                i12 = 16777215;
                            } else {
                                if (this.e == null) {
                                    i12 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i12 = 16777215;
                                }
                                Paint paint2 = this.e;
                                Shader shader = (Shader) bVar.f1525c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = bVar.f1524b;
                                    float f21 = hVar.h;
                                    PorterDuff.Mode mode = o.f7220u;
                                    paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(hVar.f7196c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            bb.b bVar2 = hVar.f7178d;
                            if (((Shader) bVar2.f1525c) != null || bVar2.f1524b != 0) {
                                if (this.f7201d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f7201d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f7201d;
                                Paint.Join join = hVar.f7184m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = hVar.f7183l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(hVar.f7185n);
                                Shader shader2 = (Shader) bVar2.f1525c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(hVar.f7180g * f20));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = bVar2.f1524b;
                                    float f22 = hVar.f7180g;
                                    PorterDuff.Mode mode2 = o.f7220u;
                                    paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(hVar.e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i13 = i11 + 1;
                c10 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f7206l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f7206l = i;
    }

    public l(l lVar) {
        this.f7200c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f7204j = 0.0f;
        this.f7205k = 0.0f;
        this.f7206l = 255;
        this.f7207m = null;
        this.f7208n = null;
        r.e eVar = new r.e(0);
        this.f7209o = eVar;
        this.f7203g = new i(lVar.f7203g, eVar);
        this.f7198a = new Path(lVar.f7198a);
        this.f7199b = new Path(lVar.f7199b);
        this.h = lVar.h;
        this.i = lVar.i;
        this.f7204j = lVar.f7204j;
        this.f7205k = lVar.f7205k;
        this.f7206l = lVar.f7206l;
        this.f7207m = lVar.f7207m;
        String str = lVar.f7207m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f7208n = lVar.f7208n;
    }
}
