package u8;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f9026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f9027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9029d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9032j;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9030f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9031g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f9033k = null;

    public j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f9026a = charSequence;
        this.f9027b = textPaint;
        this.f9028c = i;
        this.f9029d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f9026a == null) {
            this.f9026a = "";
        }
        int iMax = Math.max(0, this.f9028c);
        CharSequence charSequenceEllipsize = this.f9026a;
        int i = this.f9030f;
        TextPaint textPaint = this.f9027b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f9033k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f9029d);
        this.f9029d = iMin;
        if (this.f9032j && this.f9030f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.e);
        builderObtain.setIncludePad(this.i);
        builderObtain.setTextDirection(this.f9032j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f9033k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f9030f);
        float f10 = this.f9031g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f10);
        }
        if (this.f9030f > 1) {
            builderObtain.setHyphenationFrequency(this.h);
        }
        return builderObtain.build();
    }
}
