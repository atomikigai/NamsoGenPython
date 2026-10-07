package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f808b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f807a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f809c = 1.0f;

    public w(p pVar) {
        qd.b.j(pVar, "metadata cannot be null");
        this.f808b = pVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        l.a().getClass();
        p pVar = this.f808b;
        a3.j jVar = pVar.f786b;
        Typeface typeface = (Typeface) jVar.f110d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) jVar.f108b, pVar.f785a * 2, 2, f10, i12, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f807a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        p pVar = this.f808b;
        f1.a aVarB = pVar.b();
        int iA = aVarB.a(14);
        this.f809c = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f3578d).getShort(iA + aVarB.f3575a) : (short) 0);
        f1.a aVarB2 = pVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f3578d).getShort(iA2 + aVarB2.f3575a);
        }
        f1.a aVarB3 = pVar.b();
        int iA3 = aVarB3.a(12);
        short s10 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f3578d).getShort(iA3 + aVarB3.f3575a) : (short) 0) * this.f809c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
